package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/1/15 0015.
 */
@RestController
public class DemoController {

    @RequestMapping("hello")
    @ResponseBody
    public Object demo(){
        return "hello aaa!";
    }
}
