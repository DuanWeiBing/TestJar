package com.my.controller;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class application  {
    @RequestMapping("/index")
    public String show01(){
        Users users=new Users();
        users.setName("大卫");
        users.setPwd("123456");
        String s = JsonUtils.objectToJson(users);
        return s;
    }
}
