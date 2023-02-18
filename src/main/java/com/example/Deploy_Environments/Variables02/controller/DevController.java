package com.example.Deploy_Environments.Variables02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev")
public class DevController {

    @Autowired
    private Environment environment;


    @GetMapping("/getproperty")
    public String getProperty(){
        return environment.getProperty("myWelcomeMessage.WelcomeMessage");
    }
}