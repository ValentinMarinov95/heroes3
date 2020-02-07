package com.example.heroes.data.models.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class UsersController{
    @GetMapping("/")
    public String getIndex() {
        return "home/index.html";
    }

    @GetMapping("/home")
    public String getHome() {
        return "home/home.html";
    }

}
