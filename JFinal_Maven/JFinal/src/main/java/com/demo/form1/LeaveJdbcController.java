package com.demo.form1;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.kit.Kv;
import com.jfinal.kit.Ret;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

import cn.hutool.core.util.IdUtil;

@Path("/leave/jdbc")
public class LeaveJdbcController extends Controller {
    public void index() {
        String uuid = IdUtil.simpleUUID();
        String date = getPara("date");
        String name = getPara("name");
        String dept = getPara("dept");
        String post = getPara("post");
        String reason = getPara("reason");
        String type = getPara("type");
        String day = getPara("day");
        String hour = getPara("hour");
        String opinion = getPara("opinion");
        String sign = getPara("sign");
        String date1 = getPara("date1");
        Record user = new Record().set("uuid", uuid).set("date", date).set("name", name).set("dept", dept)
                .set("post", post).set("reason", reason).set("type", type).set("day", day)
                .set("hour", hour).set("opinion", opinion).set("sign", sign).set("date1", date1);
        Db.save("leave", "uuid", user);
        Kv data = Kv.by("date", date).set("name", name).set("dept", dept).set("post", post)
                .set("reason", reason).set("type", type).set("day", day).set("hour", hour)
                .set("opinion", opinion).set("sign", sign).set("date1", date1);
        renderJson(Ret.ok("data", data));
    }
}
