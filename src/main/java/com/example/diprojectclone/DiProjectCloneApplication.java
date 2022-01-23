package com.example.diprojectclone;

import com.example.diprojectclone.controllers.GreetingController;
import com.example.diprojectclone.services.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiProjectCloneApplication {

    public static void main(String[] args) {
        ApplicationContext ctx=SpringApplication.run(DiProjectCloneApplication.class, args);

        GreetingController greetingController=(GreetingController) ctx.getBean("greetingController");
        System.out.println(greetingController.sayGreeting());


    }

}
