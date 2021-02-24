package com.demo.jdbc;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.dialect.PostgreSqlDialect;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.server.undertow.UndertowServer;
import com.jfinal.template.Engine;

public class JdbcConfig1 extends JFinalConfig {

    public static void main(String[] args) throws Exception{
        UndertowServer.start(JdbcConfig1.class);
    }
    
    @Override
    public void configConstant(Constants me) {
        me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
        me.scan("com.demo.jdbc");
    }

    @Override
    public void configEngine(Engine me) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void configPlugin(Plugins me) {
        DruidPlugin dp = new DruidPlugin("jdbc:postgresql://172.16.6.51:5432/postgres", "postgres", "pjh");
        me.add(dp);
        ActiveRecordPlugin arp = new ActiveRecordPlugin("pgsql", dp);
        me.add(arp);
        arp.setDialect(new PostgreSqlDialect());
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
