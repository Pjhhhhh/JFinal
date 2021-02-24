package com.demo.jdbc;

import java.util.List;
import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

@Path("/jdbc")
public class JdbcController extends Controller {
    public void index() {
        /*
        //new User().set("org_id", "3").set("org_name", "1").save();
        //new User().dao().deleteById('3');
        String sql = "select org_name from blms_org where org_id = ?";
        List<User> userList = new User().find(sql, "1");
        String s = userList.get(0).getStr("org_name");
        renderText(s);*/
        Record user = new Record().set("org_id", "3");
        Db.use("pgsql").save("blms_org", "org_id", user);
        Db.use("pgsql").delete("delete from blms_org where org_id = ?", "3");
        Record user1 = new Record().set("org_id", "4");
        Db.use("pgsql").save("blms_org", "org_id", user1);
        Db.use("pgsql").deleteById("blms_org", "org_id", "4");
        String sql = "select org_name from blms_org where org_id = ?";
        List<Record> userList = Db.use("pgsql").find(sql, "1");
        String s = userList.get(0).getStr("org_name");
        Record user2 = new Record().set("test_id", "1");
        Db.use("pgsql1").save("test", "test_id", user2);
        String sql1 = "select test_id from test where test_id = ?";
        List<Record> userList1 = Db.use("pgsql1").find(sql1, "1");
        String s1 = userList1.get(0).getStr("test_id");
        renderText(s + "\n" + s1);
        Db.use("pgsql1").deleteById("test", "test_id", "1");
    }
}
