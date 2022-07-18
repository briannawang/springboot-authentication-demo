package com.example.basicauthdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenController {
    @GetMapping("/securityNone")
    public String success() {
        return "No Security success";
    }
}
