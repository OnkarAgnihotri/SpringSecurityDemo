package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApi {

    @PostMapping("/user/login")
    public String UserLogin(){
        return "User Login";
    }

    @GetMapping("/user/details")
    public String getUserDetails(){
        return "User Details : Name: John Doe, Age: 30";
    }


}
