package com.example.dependency_injection.controllers_withoutSpring;

import com.example.dependency_injection.service_withoutSpring.MyHelloServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller =  new SetterInjectedController();
        controller.myHelloService = new MyHelloServiceImpl();
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}