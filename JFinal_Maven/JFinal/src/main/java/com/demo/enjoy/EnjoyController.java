package com.demo.enjoy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;

@Path("/enjoy")
public class EnjoyController extends Controller {
    
    public class User {
        String name;
        int age;
        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
    }
    
    public void index() {
        User user = new User();
        user.setName("pjh");
        user.setAge(22);
        set("user", user);
        set("num", 1);
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        set("map", map);
        List<String> list = new ArrayList<>();
        list.add("11");
        list.add("22");
        list.add("33");
        set("list", list);
        set("para", null);
        //render("/enjoy.html");
        render("/enjoy.txt");
    }
}
