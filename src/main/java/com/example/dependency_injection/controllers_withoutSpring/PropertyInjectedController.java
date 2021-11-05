package com.example.dependency_injection.controllers_withoutSpring;

import com.example.dependency_injection.service_withoutSpring.MyHelloService;

public class PropertyInjectedController {

    public MyHelloService myHelloService;

    public String sayHello(){
        return myHelloService.sayHello();
    }

}
