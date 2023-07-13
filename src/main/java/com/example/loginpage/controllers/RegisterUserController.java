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
@CrossOrigin
public class RegisterUserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        System.out.println("Controlador de cadastro chamado");
        return ResponseEntity.ok(userRepository.save(user));
    }
}
