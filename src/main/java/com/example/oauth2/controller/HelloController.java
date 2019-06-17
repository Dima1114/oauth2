package com.example.oauth2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String listUser(){
        return "hello jwt!";
    }

}