package com.example.diprojectclone.services;

public class GermanGreetingImpl implements GreetingService{
    private final GreetingRepository greetingRepository;

    public GermanGreetingImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.sayHelloinGermany();
    }
}
