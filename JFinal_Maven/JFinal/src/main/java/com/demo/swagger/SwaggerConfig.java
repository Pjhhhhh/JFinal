package com.demo.swagger;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.server.undertow.UndertowServer;
import com.jfinal.template.Engine;

import live.autu.plugin.jfinal.swagger.config.SwaggerPlugin;
import live.autu.plugin.jfinal.swagger.config.routes.SwaggerRoutes;

public class SwaggerConfig extends JFinalConfig {

    public static void main(String[] args) throws Exception{
        UndertowServer.start(SwaggerConfig.class);
    }
    
    @Override
    public void configConstant(Constants me) {
        me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
        me.add(new SwaggerRoutes());
        me.scan("com.demo.swagger");
    }

    @Override
    public void configEngine(Engine me) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void configPlugin(Plugins me) {
        me.add(new SwaggerPlugin());
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
