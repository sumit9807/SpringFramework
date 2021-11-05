package com.example.dependency_injection.controller_withSpring;

import com.example.dependency_injection.service_withSpring.MyHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public MyHelloService myHelloService;

    public String sayHello(){
        return myHelloService.sayHello();
    }

}
