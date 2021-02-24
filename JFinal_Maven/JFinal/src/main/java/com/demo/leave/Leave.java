package com.demo.leave;

import com.jfinal.server.undertow.UndertowServer;

public class Leave {
    
    public static void main(String[] args) {
        UndertowServer.start(LeaveConfig.class);
    }
    
}
