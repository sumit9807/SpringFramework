package com.example.dependency_injection.service_withSpring;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedService implements MyHelloService{
    @Override
    public String sayHello() {
        return "Hello World -- Property";
    }
}
