package com.demo.form1;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.kit.Kv;
import com.jfinal.kit.Ret;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

@Path("/form/jdbc")
public class JdbcController extends Controller {
    public void index() {
        String id = getPara("id");
        String name = getPara("name");
        Record user = new Record().set("id", id).set("name", name);
        Db.save("test", user);
        Kv data = Kv.by("id", id).set("name", name);
        renderJson(Ret.ok("data", data));
    }
}
