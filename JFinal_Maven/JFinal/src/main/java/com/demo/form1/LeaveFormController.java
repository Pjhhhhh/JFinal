package com.demo.form1;

import java.util.ArrayList;
import java.util.List;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.kit.Kv;
import com.jfinal.kit.Ret;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

import cn.hutool.core.util.StrUtil;

@Path("/leave/form")
public class LeaveFormController extends Controller {
    public void index() {
        String findName = getPara("findName");
        String sql = "select * from leave where 1 = 1";
        List<Record> userList;
        if (StrUtil.isNotBlank(findName)) {
            sql += " and name = ?";
            userList = Db.find(sql, findName);
        } else {
            userList = Db.find(sql);
        }
        List<Kv> list = new ArrayList<>();
        for (int i = 0; i < userList.size(); i++) {
            String date = userList.get(i).getStr("date");
            String name = userList.get(i).getStr("name");
            String dept = userList.get(i).getStr("dept");
            String post = userList.get(i).getStr("post");
            String reason = userList.get(i).getStr("reason");
            String type = userList.get(i).getStr("type");
            String day = userList.get(i).getStr("day");
            String hour = userList.get(i).getStr("hour");
            String opinion = userList.get(i).getStr("opinion");
            String sign = userList.get(i).getStr("sign");
            String date1 = userList.get(i).getStr("date1");
            Kv data = Kv.by("date", date).set("name", name).set("dept", dept)
                    .set("post", post).set("reason", reason).set("type", type)
                    .set("day", day).set("hour", hour).set("opinion", opinion)
                    .set("sign", sign).set("date1", date1);
            list.add(data);
        }
        renderJson(Ret.ok("data", list));        
    }
}
