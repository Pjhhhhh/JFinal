package com.demo.form1;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;

@Path("leave")
public class LeaveController extends Controller{
    public void index() {
        render("/form/leave.html");
    }
}
