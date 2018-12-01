package io.craigmiller160.spring.didemo.controllers;

import io.craigmiller160.spring.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello World");
        return greetingService.sayGreeting();
    }

}
