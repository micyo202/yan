/*
 * Copyright (c) 2017 Yanzheng [https://github.com/micyo202/yan]
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
 * BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 * ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.yan.core.controller;

import com.github.pagehelper.PageHelper;
import com.yan.api.persistence.DelegateMapper;
import com.yan.common.model.MsgModel;
import com.yan.common.model.PageModel;
import com.yan.common.support.BaseSupport;
import com.yan.service.persistence.DelegateMapperImpl;
import com.yan.core.spring.DataSourceContextHolder;
import org.apache.commons.io.FileUtils;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 名称：ControllerSupport<br>
 * <p>
 * 描述：控制器支持类，继承于父类BaseSupport，
 * 该类提供了获取mapper、动态设置数据源、分页、返回Page、Msg对象、文件上传下载等方法，
 * 父类提供了封装好的工具类方法。（方法详细见参考信息）<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2017-08-25 16:05:05<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 * @see BaseSupport
 * @see MsgModel
 * @see PageModel
 */
public abstract class ControllerSupport extends BaseSupport {

    /**
     * 根据 spring 配置获取 mybatis 中的 sqlSessionTemplate 模板<br>
     */
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * 获取 mapper 对象<br>
     *
     * @param type 生成的 Mapper 接口对象类型
     * @return T 泛型，传入参数对象的类型Mapper
     */
    protected <T> T getMapper(Class<T> type) {
        return this.sqlSessionTemplate.getMapper(type);
    }

    /**
     * 获取 delegateMapper 对象<br>
     *
     * @return DelegateMapper 通用 mapper，查看自定义 sqlMap 的代理 mapper 对象
     */
    protected DelegateMapper getMapper() {
        return new DelegateMapperImpl(this.sqlSessionTemplate);
    }

    /**
     * 动态切换数据源方法，设置数据源名称<br>
     *
     * @param dataSource 数据源名称（必须是spring配置中包含的名称）
     */
    protected void setDataSource(String dataSource) {
        DataSourceContextHolder.setDataSource(dataSource);
    }

    /**
     * 清除数据源，在切换完数据源后，进行清理，将数据源还原为默认数据源<br>
     */
    protected void clearDataSource() {
        DataSourceContextHolder.clearDataSource();
    }

    /**
     * 分页查询范围，参数均由 bootstrapTable 分页插件进行传入，无需人工控制，只需调用方法即可<br>
     *
     * @param offset 起始数量
     * @param limit  限制条数
     */
    protected void offsetPage(int offset, int limit) {
        PageHelper.offsetPage(offset, limit);
    }

    /**
     * 分页结果集对象<br>
     *
     * @param list 查询到的分页结果，为 Page 对象
     * @return PageModel<T> 自定义的分页模型，T 为查询的对象
     */
    protected <T> PageModel<T> resultPage(List<T> list) {
        return new PageModel<>(list);
    }

    /**
     * 消息返回对象<br>
     *
     * @param status 状态值（可根据需求任意设置，无强制标准）
     * @param msg    消息内容
     * @param res    返回的对象
     * @return MsgModel 自定义消息模型
     */
    protected MsgModel resultMsg(String status, String msg, Object res) {
        return new MsgModel(status, msg, res);
    }

    /**
     * 消息返回对象<br>
     *
     * @param status 状态值（可根据需求任意设置，无强制标准）
     * @param msg    详细内容
     * @return MsgModel 自定义消息模型
     */
    protected MsgModel resultMsg(String status, String msg) {
        return new MsgModel(status, msg);
    }

    /**
     * 消息返回对象<br>
     *
     * @param msg 详细内容
     * @return MsgModel 自定义消息模型
     */
    protected MsgModel resultMsg(String msg) {
        return new MsgModel(msg);
    }

    /**
     * 文件上传方法，支持多个文件上传<br>
     *
     * @param request 上传方法中传递的 request 对象，并非父类中的 request 对象
     * @return List<String> 上传文件成功后的新文件名称，以集合形式返回
     */
    protected List<String> fileUpLoad(HttpServletRequest request) {
        try {
            List<String> list = new ArrayList<>();
            // 创建一个通用的多部分解析器
            CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
                    request.getSession().getServletContext());
            // 判断 request 是否有文件上传,即多部分请求
            if (multipartResolver.isMultipart(request)) {
                // 转换成多部分request
                MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
                // 取得request中的所有文件名
                Iterator<String> iterator = multiRequest.getFileNames();
                while (iterator.hasNext()) {
                    // 取得上传文件
                    MultipartFile file = multiRequest.getFile(iterator.next());
                    if (file != null) {
                        String originalFileName = file.getOriginalFilename();// 获取当前上传文件的文件名称
                        String fileSuffix = originalFileName.substring(originalFileName.lastIndexOf("."));// 获取文件后缀
                        // 如果名称不为"",说明该文件存在，否则说明该文件不存在
                        if ("" != originalFileName.trim()) {
                            // 重命名上传后的文件名（年月日+毫秒值）
                            String fileName = this.currentDate("yyyyMMdd") + System.currentTimeMillis() + fileSuffix;
                            String modelPath = request.getServletPath().substring(0,
                                    request.getServletPath().lastIndexOf("/"));
                            String uploadPath = this.propertiesValue("setting.upload") + modelPath;
                            this.generatePath(uploadPath);
                            // 定义上传路径
                            String path = uploadPath + "/" + fileName;
                            File localFile = new File(path);
                            file.transferTo(localFile);
                            String resPath = modelPath + "/" + fileName;
                            list.add(resPath.replaceAll("/", "_").substring(1));
                        }
                    }
                }
                return list;
            }
        } catch (IllegalStateException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 文件下载方法<br>
     *
     * @param fileName 需要下载的文件名称
     * @return ResponseEntity<byte[]> 下载的文件，在浏览器会进行下载
     */
    protected ResponseEntity<byte[]> fileDownLoad(String fileName) {
        try {
            fileName = fileName.replaceAll("_", "/");
            String path = this.propertiesValue("setting.upload") + "/" + fileName;
            File file = new File(path);
            HttpHeaders headers = new HttpHeaders();
            String downLoadFileName = new String(fileName.getBytes("UTF-8"), "ISO-8859-1");// 为了解决中文名称乱码问题
            headers.setContentDispositionFormData("attachment", downLoadFileName);
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
