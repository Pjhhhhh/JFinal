package com.demo.http;

import com.jfinal.core.Controller;
import com.jfinal.validate.*;

public class UrlValidator extends Validator {

    @Override
    protected void validate(Controller c) {
        validateRequiredString("name"); 
    }


    private void validateRequiredString(String field) {
        String value = controller.getPara(field);
        if (value == null || value.length() < 6) {
            addError(value, value);
        }
        
    }

    @Override
    protected void handleError(Controller c) {
        c.renderText("error!");
    }

}
