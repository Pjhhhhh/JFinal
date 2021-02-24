package com.demo.http;

import com.jfinal.plugin.IPlugin;

public class HelloPlugin implements IPlugin {

    protected volatile boolean isStarted = false;
    
    public boolean start() {
        if (isStarted) {
            return true;
        }
        System.out.println("Hello World!");
        isStarted = true;
        return true;
    }

    public boolean stop() {
        isStarted = false;
        return true;
    }

}
