package com.example.dependency_injection.controllers_withoutSpring;

import com.example.dependency_injection.service_withoutSpring.MyHelloServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller.setMyHelloService(new MyHelloServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}