package org.example.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public final class AboutController {

    @GetMapping("/about")
    public String about() {
        return "forward:/about/about.html";
    }
}
