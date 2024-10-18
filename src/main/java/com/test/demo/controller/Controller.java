package com.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Ola, mundo")
public class Controller {
    @GetMapping
    public String olamundo() {
        return "Ola mundo";
    }
}
