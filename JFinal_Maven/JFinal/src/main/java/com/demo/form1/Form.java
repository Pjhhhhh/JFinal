package com.demo.form1;

import com.jfinal.server.undertow.UndertowServer;

public class Form {

    public static void main(String[] args) {
        UndertowServer.start(FormConfig.class);
    }
}
