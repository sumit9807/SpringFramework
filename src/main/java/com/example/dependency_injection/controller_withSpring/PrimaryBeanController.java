package com.example.dependency_injection.controller_withSpring;

import com.example.dependency_injection.service_withSpring.MyHelloService;
import com.example.dependency_injection.service_withSpring.PrimaryBeanService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryBeanController {

    private final MyHelloService myHelloService;

    public PrimaryBeanController(MyHelloService myHelloService) {
        this.myHelloService = myHelloService;
    }

    public String getMyHelloService() {
        return myHelloService.sayHello();
    }
}
