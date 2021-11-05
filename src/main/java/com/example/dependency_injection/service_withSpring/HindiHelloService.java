package com.example.dependency_injection.service_withSpring;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("HN")
@Service("LanguageService")
public class HindiHelloService implements MyHelloService{
    @Override
    public String sayHello() {
        return "Namaste -- Hindi";
    }
}
