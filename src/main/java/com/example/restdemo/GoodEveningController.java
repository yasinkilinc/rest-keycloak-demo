package com.example.restdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodEveningController {


    @GetMapping(path = "/good-evening")
    public String hello(){
        return "hello good evening get";
    }

    @PostMapping(path = "/good-evening")
    public String hello2(){
        return "hello good evening post";
    }

}
