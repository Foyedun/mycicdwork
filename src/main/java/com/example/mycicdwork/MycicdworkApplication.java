package com.example.mycicdwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MycicdworkApplication {
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome to week 10";
    }

    public static void main(String[] args) {
        SpringApplication.run(MycicdworkApplication.class, args);
    }

}
