package com.demo.leave;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;

@Path("/index")
public class IndexController extends Controller {
    
    public void index() {
        render("/leave/index.html");
    }
}
