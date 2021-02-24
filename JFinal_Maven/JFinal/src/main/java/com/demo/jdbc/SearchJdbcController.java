package com.demo.jdbc;

import java.util.List;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

@Path("/searchTable")
public class SearchJdbcController extends Controller {
    public void index() {
        /*String col = getPara("col");
        String value = getPara("value");
        Kv cond = Kv.by("col", col).set("id", value);
        List<Record> list = Db.template("jdbc.search", cond).find();
        renderJson(list);*/
        String id = getPara("id");
        String parent = getPara("parent");
        Kv cond = Kv.by("id", id).set("parent", parent);
        List<Record> list = Db.template("jdbc.search1", cond).find();
        String s = list.get(0).getStr("org_name");
        renderText(s);
    }
}
