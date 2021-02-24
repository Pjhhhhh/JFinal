package com.demo.form;

import java.util.ArrayList;
import java.util.List;

import com.jfinal.kit.Ret;
import com.jfinal.server.undertow.UndertowServer;

public class Form {
    static List<Ret> list = new ArrayList<>();
    
    public static void main(String[] args) {
        UndertowServer.start(FormConfig.class);
    }
 
    static List<Ret> getList() {
        return list;
    }
}
