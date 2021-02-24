package com.demo.enjoy;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.server.undertow.UndertowServer;
import com.jfinal.template.Engine;

public class EnjoyConfig extends JFinalConfig {
    public static void main(String[] args) {
        UndertowServer.start(EnjoyConfig.class);
    }

    @Override
    public void configConstant(Constants me) {
        me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
        me.scan("com.demo.enjoy");
    }

    @Override
    public void configEngine(Engine me) {
        me.setDevMode(true);
        Engine.setChineseExpression(true);
        //me.setToClassPathSourceFactory();
    }

    @Override
    public void configPlugin(Plugins me) {
        
    }

    @Override
    public void configInterceptor(Interceptors me) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void configHandler(Handlers me) {
        // TODO Auto-generated method stub
        
    }
}
