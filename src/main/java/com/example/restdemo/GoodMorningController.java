package com.example.restdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodMorningController {


    @GetMapping(path = "/good-morning")
    public String hello(){
        return "hello good morning get";
    }

    @PostMapping(path = "/good-morning")
    public String hello2(){
        return "hello good morning post";
    }

}
