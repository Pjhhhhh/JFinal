package com.demo.form1;

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

public class FormConfig extends JFinalConfig{
    
    public static void main(String[] args) {
        UndertowServer.start(FormConfig.class);
    }

    public void configConstant(Constants me) {
       me.setDevMode(true);
    }
    
    public void configRoute(Routes me) {
       me.scan("com.demo.form1");
    }
    
    public void configEngine(Engine me) {
    }
    public void configPlugin(Plugins me) {
        DruidPlugin dp = new DruidPlugin("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "pjh");
        me.add(dp);
        ActiveRecordPlugin arp = new ActiveRecordPlugin("pgsql", dp);
        arp.setShowSql(true);
        me.add(arp);
        arp.setDialect(new PostgreSqlDialect());
    }
    public void configInterceptor(Interceptors me) {}
    public void configHandler(Handlers me) {}
}
