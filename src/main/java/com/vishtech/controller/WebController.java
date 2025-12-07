package com.vishtech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class WebController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Microservice!";
    }
}
