package com.example.SpringBootValidationExample.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootValidationExample.DTO.UserRequest;
import com.example.SpringBootValidationExample.Entity.Users;
import com.example.SpringBootValidationExample.Exceptions.UserNotFoundException;
import com.example.SpringBootValidationExample.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public Users save(UserRequest req) {
        Users user = Users.build(0,req.getName(), req.getEmail(), req.getAge(), req.getRegisterDate());
        return repository.save(user);
    }

    public List<Users> fetchAll() {
        return repository.findAll();
    }

    public Users getUser(int id) throws UserNotFoundException {
        Users users = repository.getUserById(id);
        if(users != null)
        {
            return users;
        }
        throw new UserNotFoundException("No user found with id : "+id);
    }
}
