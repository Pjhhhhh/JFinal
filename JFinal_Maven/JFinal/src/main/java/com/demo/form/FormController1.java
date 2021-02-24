package com.demo.form;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;

@Path("/form")
public class FormController1 extends Controller {
    public void login1() {
        render("/form/form.html");
    }
    
    public void login() {
        renderText(getPara("id") + " " + getPara("password"));
    }
}
