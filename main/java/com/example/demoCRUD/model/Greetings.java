package com.example.demoCRUD.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {

    @GetMapping("/greeting")
    public String greet(){
        return "Greetings!";
    }
}
