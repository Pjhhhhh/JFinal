package com.demo.enjoy;

import java.util.List;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.SqlPara;

@Path("/enjoyjdbc")
public class EnjoyJdbcController extends Controller {
    public void index() {
        String sql = Db.getSql("jdbc.jdbc");
        List<Record> us = Db.find(sql, "0");
        String s = us.get(0).getStr("org_name");
        Kv cond = Kv.by("id", "1");
        SqlPara sqlpara = Db.getSqlPara("jdbc.jdbc1", cond);
        List<Record> us1 = Db.find(sqlpara);
        String s1 = us1.get(0).getStr("org_name");
        Kv cond1 = Kv.by("columns", "org_name").set("id", "2");
        List<Record> us2 = Db.template("jdbc.jdbc2", cond1).find();
        String s2 = us2.get(0).getStr("org_name");
        renderText(s + " " + s1 + " " + s2);
    }
}
