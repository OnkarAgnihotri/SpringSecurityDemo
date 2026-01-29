package com.example.demo.api;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApi {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/user/register")
    public String registerUser(@RequestBody UserEntity user){

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "User Registered";
    }

    @PostMapping("/user/login")
    public String UserLogin(){
        return "User Login";
    }

    @GetMapping("/user/details")
    public String getUserDetails(){
        return "User Details : Name: John Doe, Age: 30";
    }


}
