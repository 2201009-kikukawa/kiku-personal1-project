package com.example.backend.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GreetingController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World from Spring Boot!";
    }
}

