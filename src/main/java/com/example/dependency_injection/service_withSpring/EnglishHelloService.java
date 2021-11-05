package com.example.dependency_injection.service_withSpring;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("EN")
@Service("LanguageService")
public class EnglishHelloService implements MyHelloService{
    @Override
    public String sayHello() {
        return "Hello World - English";
    }
}
