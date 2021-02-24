package com.demo.jdbc;

import java.util.List;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

@Path("/centosjdbc")
public class JdbcController1 extends Controller {
    public void index() {
        Record user = new Record().set("id", 1).set("name","1");
        Db.save("test", user);
        String sql = "select name from test where id = 1";
        List<Record> userList = Db.find(sql);
        String s = userList.get(0).getStr("name");
        renderText(s);
    }
}
