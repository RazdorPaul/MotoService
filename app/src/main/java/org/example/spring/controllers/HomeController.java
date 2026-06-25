package org.example.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public final class HomeController {
    @GetMapping("/")
    public String home() {
        return "forward:/index.html";
    }
}
