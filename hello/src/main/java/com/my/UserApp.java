package com.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class UserApp{
    public static void main(String[] args) {
        SpringApplication.run(UserApp.class,args);
    }
}
