package com.example.dependency_injection.controllers_withoutSpring;

import com.example.dependency_injection.service_withoutSpring.MyHelloServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new MyHelloServiceImpl());
    }

    @Test
    void getMyHelloService() {
        System.out.println(constructorInjectedController.getMyHelloService());
    }
}