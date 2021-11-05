package com.example.dependency_injection.controller_withSpring;

import com.example.dependency_injection.service_withSpring.MyHelloService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final MyHelloService myHelloService;

    public ConstructorInjectedController(MyHelloService myHelloService) {
        this.myHelloService = myHelloService;
    }

    public String getMyHelloService() {
        return myHelloService.sayHello();
    }
}
