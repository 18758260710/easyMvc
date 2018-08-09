package com.easyMVC.controller;

import com.easyMVC.annotation.Controller;
import com.easyMVC.annotation.RequestMapping;
import com.easyMVC.annotation.RequestParam;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by admin on 2018/8/8.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/doTest")
    public void test1(HttpServletRequest request, HttpServletResponse response,
        @RequestParam("param") String param){
        System.out.println(param);
        try {
            response.getWriter().write( "doTest method success! param:"+param);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
