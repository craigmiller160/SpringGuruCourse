package io.craigmiller160.spring.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Primarer Grubdienst";
    }
}
