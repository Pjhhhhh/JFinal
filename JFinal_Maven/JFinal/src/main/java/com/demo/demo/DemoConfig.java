package com.demo.demo;

import com.jfinal.config.*;
import com.jfinal.server.undertow.UndertowServer;
import com.jfinal.template.Engine;

public class DemoConfig extends JFinalConfig {

    public static void main(String[] args) {
        UndertowServer.start(DemoConfig.class);
        //UndertowServer.start(DemoConfig.class, 8088, true);
        //JFinal.start("WebRoot", 8088, "/", 5);
    }
 
    public void configConstant(Constants me) {
       me.setDevMode(true);
    }
    
    public void configRoute(Routes me) {
       //me.add("/hello", HelloController.class);
       me.scan("com.demo.demo.");
    }
    
    public void configEngine(Engine me) {}
    public void configPlugin(Plugins me) {}
    public void configInterceptor(Interceptors me) {}
    public void configHandler(Handlers me) {}
}