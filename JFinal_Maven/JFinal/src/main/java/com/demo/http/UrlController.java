package com.demo.http;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.core.Path;

@Path("/app")
public class UrlController extends Controller {
    @Before(UrlValidator.class)
    public void index() {
        renderText("Method: " + getRequest().getMethod() + " | name: " + getPara("name"));
    }
}
