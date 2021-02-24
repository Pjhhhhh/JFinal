package com.demo;

import com.demo.jdbc.User;
import com.jfinal.core.Controller;
import com.jfinal.core.Path;

@Path("/session")
public class SessionController extends Controller {
    public void index() {
        User user = new User();
        setSessionAttr("user", user);
        getSessionAttr("user");
        renderText("1");
    }
}
