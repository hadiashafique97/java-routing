package com.example.apidemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// this is letting spring know we are defining routes here
public class DemoController {
    // controller is where the endpoints are hosted in react where you define routes that is what controller
    // annotation is an @ sign so
    @GetMapping("/Home")

    public String sayGreeting(){
        return "hello and welcome";
    }
    // so for get put post and delete you put the verb and then mapping after

}
