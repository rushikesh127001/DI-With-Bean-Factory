package com.example.diprojectclone.config;


import com.example.diprojectclone.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingConfig {

    @Bean
    GreetingsFactory greetingsFactoryCreator(GreetingRepository greetingRepository){
        return new GreetingsFactory(greetingRepository);
    }



    @Bean
    @Profile("en")
    public GreetingService sayInEnglish(GreetingsFactory greetingsFactory){
        return greetingsFactory.createGreeting("en");

    }

    @Bean
    @Profile("gm")
    public GreetingService sayInGerman(GreetingsFactory greetingsFactory){
        return greetingsFactory.createGreeting("gm");

    }
}
