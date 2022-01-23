package com.example.diprojectclone.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingsFactory {
    private final GreetingRepository greetingRepository;

    public GreetingsFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreeting(String lang){
        switch (lang){
            case "gm": return new GermanGreetingImpl(greetingRepository);
            default: return new EnglishGreetingImpl(greetingRepository);
        }

    }


}
