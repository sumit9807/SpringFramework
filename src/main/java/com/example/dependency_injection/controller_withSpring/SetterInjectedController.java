package com.example.dependency_injection.controller_withSpring;

import com.example.dependency_injection.service_withSpring.MyHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    public MyHelloService myHelloService;

    @Autowired
    @Qualifier("setterInjectedService")
    public void setMyHelloService(MyHelloService myHelloService) {
        this.myHelloService = myHelloService;
    }

    public String sayHello(){
        return myHelloService.sayHello();
    }
}
