package com.example.loginpage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loginpage.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    // Métodos do repositório
}
