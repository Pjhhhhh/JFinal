package com.demo.form1;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;

@Path("/add")
public class AddController extends Controller {
    public void index() {
        render("/form/add.html");
    }
}
