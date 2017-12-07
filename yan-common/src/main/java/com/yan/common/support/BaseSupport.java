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
package com.yan.common.support;

import java.io.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 名称：BaseSupport<br>
 * <p>
 * 描述：基本的通用的工具支持类，包括一系列常用方法的封装，为子类提供便捷的调用方式<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2017-09-08 15:31:07<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
public class BaseSupport {

    /**
     * 判断对象是否为null，或空<br>
     *
     * @param obj 需要进行判断的对象
     * @return boolean 为null或空返回 true，否则返回 false
     */
    public boolean isNull(Object obj) {
        if (null == obj)
            return true;
        if (obj instanceof List) {
            List<?> list = (List<?>) obj;
            return list.isEmpty() ? true : false;
        }
        if (obj instanceof Map) {
            Map<?, ?> map = (Map<?, ?>) obj;
            return map.isEmpty() ? true : false;
        }
        if (obj instanceof Set) {
            Set<?> set = (Set<?>) obj;
            return set.isEmpty() ? true : false;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            return str.isEmpty() ? true : false;
        }
        return false;
    }

    /**
     * 对象转换为 String，通常用于获取 Map 集合中的对象时使用<br>
     *
     * @param obj 需要转换的对象
     * @return String 对象的值（为null则返回""）
     */
    public String obj2Str(Object obj) {
        return null == obj ? "" : obj.toString();
    }

    /**
     * 生成 uuid 主键，长度为32位，且为大写模式<br>
     *
     * @return String 32位主键字符串
     */
    public String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
    }

    /**
     * 对字符串进行 base64 编码<br>
     *
     * @param str 需要进行编码的字符串
     * @return String 进行编码后的结果字符串
     */
    public String base64Encoder(String str) {
        if (this.isNull(str))
            return null;
        return Base64.getUrlEncoder().encodeToString(str.getBytes(StandardCharsets.UTF_8));
    }

    /**
     * 对字符串进行 base64 解码<br>
     *
     * @param str 已进行 base64 编码的编码字符串
     * @return String 解码后的原字符串
     */
    public String base64Decoder(String str) {
        if (this.isNull(str))
            return null;
        return new String(Base64.getUrlDecoder().decode(str), StandardCharsets.UTF_8);
    }

    /**
     * 对字符串进行 md5 加密算法<br>
     *
     * @param str 需要进行 md5 加密的字符串
     * @return String 加密后的结果
     */
    public String md5(String str) {
        if (this.isNull(str))
            return null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            return new BigInteger(1, md.digest()).toString(16).toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取系统当前时间<br>
     *
     * @param pattern 获取系统时间的格式，如：yyyy-MM-dd HH:mm:ss
     * @return String 返回格式化后的当前时间
     */
    public String currentDate(String pattern) {
        if (this.isNull(pattern))
            return null;
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(new Date());
    }

    /**
     * 时间戳转换成日期<br>
     *
     * @param timestamp 需要进行转换的时间戳
     * @param pattern   转换后的格式
     * @return String 格式化后的日期
     */
    public String timeStamp2Date(String timestamp, String pattern) {
        if (this.isNull(timestamp) || this.isNull(pattern))
            return null;
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(new Date(Long.valueOf(timestamp)));
    }

    /**
     * 日期转换为时间戳<br>
     *
     * @param dateStr 需要进行转换的日期字符串
     * @param pattern 日期的格式
     * @return String 转换后的时间戳
     */
    public String date2TimeStamp(String dateStr, String pattern) {
        if (this.isNull(dateStr) || this.isNull(pattern))
            return null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            return String.valueOf(sdf.parse(dateStr).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 从指定文件中读取文件内容<br>
     *
     * @param filePath 文件路径（绝对路径）
     * @return String 读取的文件内容
     */
    public String readFromFile(String filePath) {
        if (this.isNull(filePath))
            return null;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            File file = new File(filePath);// 指定要读取的文件
            FileReader reader = new FileReader(file);// 获取该文件的输入流
            char[] bb = new char[1024];// 用来保存每次读取到的字符
            int n;// 每次读取到的字符长度
            while ((n = reader.read(bb)) != -1) {
                stringBuffer.append(new String(bb, 0, n));
            }
            reader.close();// 关闭输入流，释放连接
            return stringBuffer.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将内容写入到指定文件中（写入会覆盖文件原有内容，建议先读取，再写入，将读取的内容与需要写入的内容并在一起进行写入）<br>
     *
     * @param content  需要写入文件中的内容
     * @param filePath 文件路径（绝对路径）
     */
    public void writeToFile(String content, String filePath) {
        if (!this.isNull(content) && !this.isNull(filePath)) {
            try {
                generateFile(filePath);
                File file = new File(filePath);// 要写入的文本文件
                FileWriter writer = new FileWriter(file);// 获取该文件的输出流
                writer.write(content);// 写内容
                writer.flush();// 清空缓冲区，立即将输出流里的内容写到文件里
                writer.close();// 关闭输出流，施放资源
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 生成指定路径文件夹，先进行判断文件夹是否存在，若不存在则创建对应目录的文件夹，若存在则不进行任何操作<br>
     *
     * @param path 文件夹路径（绝对路径）
     */
    public void generatePath(String path) {
        if (!this.isNull(path)) {
            File file = new File(path);
            if (!file.exists() && !file.isDirectory()) {
                file.mkdirs();
            }
        }
    }

    /**
     * 生成指定路径的文件，先进行判断文件是否存在，若不存在则进行创建文件，若存在则不进行任何操作<br>
     *
     * @param path 文件路径（绝对路径）
     */
    public void generateFile(String path) {
        if (!this.isNull(path)) {
            File file = new File(path);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 读取配置 properties 文件中的值，读取 classpath 下 /properties/setting.properties 配置文件<br>
     *
     * @param key 资源文件中的 key 值
     * @return String 读取到的 key 对应的 value 值
     */
    public String propertiesValue(String key) {
        if (this.isNull(key))
            return null;
        try {
            // 获取需要读取的properties文件路径
            Properties prop = new Properties();
            InputStream inputStream = this.getClass().getResourceAsStream("/properties/setting.properties");
            prop.load(inputStream);
            return prop.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 读取指定路径 properties 文件中的值，会从 classpath 路径下进行查找资源文件<br>
     *
     * @param resource 资源文件路径（对应 classpath 中的路径）
     * @param key      资源文件中的 key 值
     * @return String 读取到的 key 对应的 value 值
     */
    public String propertiesValue(String resource, String key) {
        if (this.isNull(resource) || this.isNull(key))
            return null;
        try {
            // 获取需要读取的properties文件路径
            Properties prop = new Properties();
            InputStream inputStream = this.getClass().getResourceAsStream(resource);
            prop.load(inputStream);
            return prop.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
