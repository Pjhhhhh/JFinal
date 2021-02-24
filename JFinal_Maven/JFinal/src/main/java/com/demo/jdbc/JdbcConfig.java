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

public class JdbcConfig extends JFinalConfig {

    public static void main(String[] args) throws Exception{
        UndertowServer.start(JdbcConfig.class);
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
        DruidPlugin dp = new DruidPlugin("jdbc:postgresql://172.16.0.76:5433/rbac", "demo", "demo");
        me.add(dp);
        ActiveRecordPlugin arp = new ActiveRecordPlugin("pgsql", dp);
        me.add(arp);
        arp.setDialect(new PostgreSqlDialect());
        DruidPlugin dp1 = new DruidPlugin("jdbc:postgresql://172.16.0.76:5434/postgres", "demo1", "demo1");
        me.add(dp1);
        ActiveRecordPlugin arp1 = new ActiveRecordPlugin("pgsql1", dp1);
        me.add(arp1);   
        arp1.setDialect(new PostgreSqlDialect());
        //arp.addMapping("blms_org", "org_id", User.class);
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
