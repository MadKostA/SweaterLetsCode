package com.example.SweaterLetsCode.repository;

import com.example.SweaterLetsCode.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
