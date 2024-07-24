package com.di.java.demo.javademo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Value("${custom.name}")
    private String username;

    @GetMapping("/")
    public String printMessage(){
        return "Hello World " + username;
    }
}
