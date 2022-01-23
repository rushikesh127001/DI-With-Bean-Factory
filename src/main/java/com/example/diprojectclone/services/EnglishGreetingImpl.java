package com.example.diprojectclone.services;

public class EnglishGreetingImpl implements GreetingService{
    private final GreetingRepository greetingRepository;
    public EnglishGreetingImpl(GreetingRepository greetingRepository) {
        this.greetingRepository=greetingRepository;
    }


    @Override
    public String sayGreeting() {
        return greetingRepository.sayHelloInEnglish();
    }
}
