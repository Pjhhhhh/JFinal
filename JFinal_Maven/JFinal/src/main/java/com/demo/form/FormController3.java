package com.demo.form;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.kit.Ret;

@Path("/form2")
public class FormController3 extends Controller {
    public void login() {
        render("/form/form1.html");
    }
    
    public void login1() {
        String name = getPara("name");
        String password = getPara("password");
        //System.out.println(name);
        renderJson(Ret.ok("name", name).set("password", password));
    }
}
