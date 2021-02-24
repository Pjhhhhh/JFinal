package com.demo.form;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;

@Path("/form1")
public class FormController2 extends Controller{
    public void login1() {
        render("/test/form.html");
    }
    
    public void login() {
        renderText(getPara("name") + " " + getPara("addr"));
    }
}
