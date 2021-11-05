package com.example.dependency_injection.controller_withSpring;

import org.springframework.stereotype.Controller;

@Controller("controllerWithDifferentName")
public class MyControllerWithDifferentName {

    public String sayHello(){
        System.out.println("Hello World from Controller_2");
        return "Hello World from Main for Controller_2";
    }
}
