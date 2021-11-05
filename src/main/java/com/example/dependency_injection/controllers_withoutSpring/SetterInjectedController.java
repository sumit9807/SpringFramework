package com.example.dependency_injection.controllers_withoutSpring;

import com.example.dependency_injection.service_withoutSpring.MyHelloService;

public class SetterInjectedController {

    public MyHelloService myHelloService;

    public void setMyHelloService(MyHelloService myHelloService) {
        this.myHelloService = myHelloService;
    }

    public String sayHello(){
        return myHelloService.sayHello();
    }
}
