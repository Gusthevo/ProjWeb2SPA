package com.example.loginpage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.loginpage.model.Message;
import com.example.loginpage.repositories.MessageRepository;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class MessageController {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @GetMapping("/chat")
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    @PostMapping("/chat")
    public void createMessage(@RequestBody Message message) {
        messageRepository.save(message);
    }

    // Outros métodos do controlador
}
