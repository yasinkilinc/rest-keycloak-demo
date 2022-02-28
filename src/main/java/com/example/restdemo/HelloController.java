package com.example.restdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping(path = "/hello")
    public String hello(){
        return "hello get";
    }

    @PostMapping(path = "/hello")
    public String hello2(){
        return "hello post";
    }

}
