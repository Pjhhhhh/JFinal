package com.demo.form1;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;

@Path("/index")
public class IndexController extends Controller {
    public void index() {
        render("/form/form22.html");
    }
}
