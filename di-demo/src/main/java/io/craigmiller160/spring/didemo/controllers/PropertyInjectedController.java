package io.craigmiller160.spring.didemo.controllers;

import io.craigmiller160.spring.didemo.services.GreetingServiceImpl;

/**
 * Case study in everything not to do
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
