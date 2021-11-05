package com.example.dependency_injection.controllers_withoutSpring;

import com.example.dependency_injection.service_withoutSpring.MyHelloService;

public class ConstructorInjectedController {

    private final MyHelloService myHelloService;

    public ConstructorInjectedController(MyHelloService myHelloService) {
        this.myHelloService = myHelloService;
    }

    public String getMyHelloService() {
        return myHelloService.sayHello();
    }
}
