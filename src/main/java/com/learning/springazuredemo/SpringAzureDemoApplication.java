package com.learning.springazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {

    @GetMapping("/")
    String getMessage()
    {
        return "Greeting! Welcome to Azure";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDemoApplication.class, args);
    }

}
