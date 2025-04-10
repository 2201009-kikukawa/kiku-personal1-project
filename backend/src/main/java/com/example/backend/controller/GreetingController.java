package com.example.backend.controller;
import com.example.backend.dto.GreetingResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GreetingController {
    @GetMapping("/hello")
    public GreetingResponse hello() {
        return new GreetingResponse("Hello World from Spring Boot!");
    }
}

