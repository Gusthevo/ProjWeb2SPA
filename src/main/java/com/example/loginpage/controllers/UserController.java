package com.example.loginpage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loginpage.model.User;
import com.example.loginpage.repositories.UserRepository;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User userData) {
        System.out.println(userData);
        User user = userRepository.findByEmail(userData.getEmail());
        if (user.getPassword().equals(userData.getPassword())) {
        return ResponseEntity.ok(user);
    }
    return (ResponseEntity<?>) ResponseEntity.internalServerError();
}
}