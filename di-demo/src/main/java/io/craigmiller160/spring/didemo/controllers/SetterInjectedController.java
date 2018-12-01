package io.craigmiller160.spring.didemo.controllers;

import io.craigmiller160.spring.didemo.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

}
