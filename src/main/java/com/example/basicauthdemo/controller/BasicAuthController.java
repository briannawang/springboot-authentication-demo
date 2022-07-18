package com.example.basicauthdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicAuthController {
    @GetMapping("/basicAuth")
    public String success() {
        return "Authentication success";
    }
}
