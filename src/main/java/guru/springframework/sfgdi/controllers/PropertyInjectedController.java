package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    public GreetingService greetingService;
    @Autowired
    public String getGreetingService(){
       return greetingService.sayGreeting();


    }
}
