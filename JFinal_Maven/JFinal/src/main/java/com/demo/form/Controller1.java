package com.demo.form;

import java.util.List;
import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.kit.Ret;

@Path("/another")
public class Controller1 extends Controller {
    public void index() {
        String id = getPara("id");
        String name = getPara("name");
        List<Ret> list = Form.getList();
        list.add(Ret.ok("id",id).set("name", name));
        renderJson(Ret.ok("data", Form.getList()));
    }
}
