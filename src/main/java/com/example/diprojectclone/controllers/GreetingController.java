package com.example.diprojectclone.controllers;

import com.example.diprojectclone.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
