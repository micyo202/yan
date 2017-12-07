package com.yan.web.controller.setting;

import com.yan.common.model.MsgModel;
import com.yan.core.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 名称：SettingController<br>
 * <p>
 * 描述：系统设置模块<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2017-09-29 16:33:41<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
@Controller
@RequestMapping("/common/setting")
public class SettingController extends BaseController {

    @RequestMapping("/manage")
    public String manage(Model model) {
        // 获取系统默认文件上传路径
        String uploadPath = this.propertiesValue("setting.upload");
        model.addAttribute("uploadPath", uploadPath);
        return "/common/setting/manage";
    }

    @RequestMapping("/save")
    @ResponseBody
    public MsgModel save(String uploadPath) {
        String filePath = this.getClass().getResource("/properties/setting.properties").getPath();

        System.out.println(this.readFromFile(filePath));
        String content = "# Copyright (c) 2017 Yanzheng [https://github.com/micyo202/yan]	\n"
                + "# 	\n"
                + "# Permission is hereby granted, free of charge, to any person obtaining	\n"
                + "# a copy of this software and associated documentation files (the	\n"
                + "# \"Software\"), to deal in the Software without restriction, including	\n"
                + "# without limitation the rights to use, copy, modify, merge, publish,	\n"
                + "# distribute, sublicense, and/or sell copies of the Software, and to	\n"
                + "# permit persons to whom the Software is furnished to do so, subject to	\n"
                + "# the following conditions:	\n"
                + "# 	\n"
                + "# The above copyright notice and this permission notice shall be	\n"
                + "# included in all copies or substantial portions of the Software.	\n"
                + "# 	\n"
                + "# THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND,	\n"
                + "# EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF	\n"
                + "# MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND	\n"
                + "# NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS	\n"
                + "# BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN	\n"
                + "# ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN	\n"
                + "# CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE	\n"
                + "# SOFTWARE.	\n\n"
                + "#setting.upload=C:/Users/Dell/Desktop/upload	\n"
                + "setting.upload=" + uploadPath;
        this.writeToFile(content, filePath);

        return this.resultMsg("保存成功！");
    }

}
