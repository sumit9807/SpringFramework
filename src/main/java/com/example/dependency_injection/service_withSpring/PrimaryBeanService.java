package com.example.dependency_injection.service_withSpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryBeanService implements MyHelloService{
    @Override
    public String sayHello() {
        return "Hello World -- From Primary Bean";
    }
}
