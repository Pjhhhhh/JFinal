package com.demo.form1;

import java.util.ArrayList;
import java.util.List;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.kit.Kv;
import com.jfinal.kit.Ret;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

@Path("/form")
public class FormController extends Controller {
    public void index() {
        String sql = "select * from test";
        List<Record> userList = Db.find(sql);
        List<Kv> list = new ArrayList<>();
        for (int i = 0; i < userList.size(); i++) {
            String id = userList.get(i).getStr("id");
            String name = userList.get(i).getStr("name");
            Kv data = Kv.by("id", id).set("name", name);
            list.add(data);
        }
        renderJson(Ret.ok("data", list));
    }
}
