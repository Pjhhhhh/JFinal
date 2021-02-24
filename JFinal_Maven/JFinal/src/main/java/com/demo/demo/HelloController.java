package com.demo.demo;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;

@Path("/Hello")
// url���ʵ�ַhttp://127.0.0.1:8088/Hello
public class HelloController extends Controller {
    public void index() {
       renderText("Hello JFinal World.");
    }
}
