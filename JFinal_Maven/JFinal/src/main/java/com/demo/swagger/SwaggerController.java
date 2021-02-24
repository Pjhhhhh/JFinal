package com.demo.swagger;

import java.util.Arrays;
import java.util.List;

import com.jfinal.core.Controller;

import live.autu.plugin.jfinal.swagger.annotation.Api;
import live.autu.plugin.jfinal.swagger.annotation.ApiImplicitParam;
import live.autu.plugin.jfinal.swagger.annotation.ApiImplicitParams;
import live.autu.plugin.jfinal.swagger.annotation.ApiOperation;
import live.autu.plugin.jfinal.swagger.config.RequestMethod;


@Api(tags = "/test", description = "测试")
public class SwaggerController extends Controller {    
    @ApiOperation(tags = "/swagger1", methods = RequestMethod.GET , description = "测试")
    @ApiImplicitParams({
                       @ApiImplicitParam(name = "id", description = "编号", required = true, dataType = "Long"),
                       @ApiImplicitParam(name = "name", description = "姓名", required = true, dataType = "String")
    })
    public void test() {
        List<String> list = Arrays.asList("123","456");
        renderJson(list);
    }
}
