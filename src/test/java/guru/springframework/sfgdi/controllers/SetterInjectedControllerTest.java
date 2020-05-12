package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.SetterGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller= new SetterInjectedController();
        controller.setGreetingService(new SetterGreetingService());
    }

    @Test
    void getGreetingService() {

        System.out.println(controller.getGreetingService());
    }
}