package com.example.myapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FirstController {
    @GetMapping
    public String greetings() {
        return "Приложение запущено";
    }
}
