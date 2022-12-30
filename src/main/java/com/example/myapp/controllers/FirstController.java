package com.example.myapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;


@RestController
public class FirstController {
    @GetMapping
    public String greetings() {
        return "Приложение запущено";
    }

    @GetMapping
    public String infoPage() {
        String nameOfPupil = "Konstantin";
        String nameOfProject = "MyApp";
        String description = "Приложения для сайта рецептов";
        LocalDate timeCreation = LocalDate.now();
        return "Имя ученика: " + nameOfPupil + ";\n"
                + "Название приложения: " + nameOfProject + ";\n"
                + "Дата создания проекта: " + timeCreation + ";\n"
                + "Описание проекта: " + description;
    }
}
