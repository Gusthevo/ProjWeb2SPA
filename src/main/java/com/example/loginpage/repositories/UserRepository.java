package com.example.loginpage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loginpage.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findByUsuario(String usuario);
    
}