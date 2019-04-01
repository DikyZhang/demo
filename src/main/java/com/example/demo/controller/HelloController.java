package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Diky on 2018/9/18.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String hello() {
        return "大哥hello world springboot project";
    }
}
