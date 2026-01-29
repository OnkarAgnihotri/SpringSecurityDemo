package com.example.demo.service;

import com.example.demo.config.UserEntityUserDetails;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserInfoDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return userRepository.findByName(username).map(UserEntityUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with name: " + username));
    }
}
