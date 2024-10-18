package com.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Demo")
public class Controller {
    @GetMapping
    public String olamundo() {
        return "esse é o meu primeiro código";
    }
}
