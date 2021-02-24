package com.demo.form;

import java.util.List;
import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.kit.Ret;

@Path("/form3")
public class FormController4 extends Controller {
    public void index() {
        render("/form/form2.html");
    }
    
    public void login() {
        String id = getPara("id");
        String name = getPara("name");
        List<Ret> list = Form.getList();
        list.add(Ret.ok("id",id).set("name", name));
        renderJson(Ret.ok("data", Form.getList()));
    }
}
