package com.demo.form1;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;

import cn.hutool.core.io.resource.ResourceUtil;

@Path("/menu")
public class MenuController extends Controller {
    public void index() {
        renderJson(ResourceUtil.readUtf8Str("./form/menu.json"));
    }
}
