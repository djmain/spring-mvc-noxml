package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by Jay on 2019/6/17
 */
@Controller
public class HelloController
{
    @RequestMapping("/hello")
    public String hello()
    {
        System.out.println("request hello ing");
        return "hello";
    }
}
