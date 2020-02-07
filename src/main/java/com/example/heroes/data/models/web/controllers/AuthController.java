package com.example.heroes.data.models.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
/*използваме RequestMapping защото на двете места имаме /user*/

public class AuthController {
    @GetMapping("/login")
    public String getLoginForm(){
        return "auth/login.html";
    }
    @GetMapping("/register")
    public String getRegisterForm(){
        return "auth/register.html";
    }
}

