package com.demo.leave;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.dialect.PostgreSqlDialect;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.template.Engine;

public class LeaveConfig extends JFinalConfig {

    public void configConstant(Constants me) {
       me.setDevMode(true);
    }
    
    public void configRoute(Routes me) {
       me.scan("com.demo.leave");
    }
    
    public void configEngine(Engine me) {
        
    }
    
    public void configPlugin(Plugins me) {
        DruidPlugin dp = new DruidPlugin("jdbc:postgresql://127.0.0.1:5432/leave", "postgres", "pjh");
        me.add(dp);
        ActiveRecordPlugin arp = new ActiveRecordPlugin("pgsql", dp);
        arp.setDevMode(true);
        arp.setShowSql(true);
        arp.addSqlTemplate("leave/jdbc.txt");
        me.add(arp);
        arp.setDialect(new PostgreSqlDialect());
    }
    
    public void configInterceptor(Interceptors me) {
        
    }
    
    public void configHandler(Handlers me) {
        
    }
    
}
