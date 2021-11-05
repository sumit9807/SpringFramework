package com.example.dependency_injection.controller_withSpring;

import com.example.dependency_injection.service_withSpring.MyHelloService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ProfileController {
    private final MyHelloService myHelloService;

    public ProfileController(@Qualifier("LanguageService") MyHelloService myHelloService) {
        this.myHelloService = myHelloService;
    }

    public String sayHello(){
        return myHelloService.sayHello();
    }
}
