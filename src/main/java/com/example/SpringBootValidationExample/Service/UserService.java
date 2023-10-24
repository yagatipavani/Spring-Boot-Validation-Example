package com.example.SpringBootValidationExample.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootValidationExample.DTO.UserRequest;
import com.example.SpringBootValidationExample.Entity.User;
import com.example.SpringBootValidationExample.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public User save(UserRequest req) {
        User user = User.build(0,req.getName(), req.getEmail(), req.getAge(), req.getRegisterDate());
        return repository.save(user);
    }

    public List<User> fetchAll() {
        return repository.findAll();
    }
}
