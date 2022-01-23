package com.example.diprojectclone.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingRepositoryImpl implements GreetingRepository {


    @Override
    public String sayHelloInEnglish() {
        return "Helllo in English";
    }

    @Override
    public String sayHelloinGermany() {
        return "Hello in GERMamnyyy";
    }
}
