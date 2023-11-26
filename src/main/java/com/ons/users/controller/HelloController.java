package com.ons.users.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/message")
public class HelloController {

	@GetMapping
    public Message getMessage() {
        return new Message("Hello from Spring Boot!");
    }
}

