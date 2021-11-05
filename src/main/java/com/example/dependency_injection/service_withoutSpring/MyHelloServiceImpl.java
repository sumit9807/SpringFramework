package com.example.dependency_injection.service_withoutSpring;

public class MyHelloServiceImpl implements MyHelloService {
    @Override
    public String sayHello(){
        return "Hello World";
    }
}
