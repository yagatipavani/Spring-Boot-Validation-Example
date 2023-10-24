package com.example.SpringBootValidationExample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootValidationExample.Entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

    Users getUserById(int id);
    
}
