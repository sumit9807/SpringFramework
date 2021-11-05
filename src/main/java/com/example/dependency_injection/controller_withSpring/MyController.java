package com.example.dependency_injection.controller_withSpring;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World from Controller");
        return "Hello World from Main";
    }
}
