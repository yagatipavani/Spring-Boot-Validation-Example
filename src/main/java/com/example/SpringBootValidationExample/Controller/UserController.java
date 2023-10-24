package com.example.SpringBootValidationExample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootValidationExample.DTO.UserRequest;
import com.example.SpringBootValidationExample.Entity.Users;
import com.example.SpringBootValidationExample.Exceptions.UserNotFoundException;
import com.example.SpringBootValidationExample.Service.UserService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/save")
    Users save(@RequestBody @Valid UserRequest req)
    {
       return service.save(req);
    }

    @GetMapping("/fetchAll")
    List<Users> getUsers()
    {
        return service.fetchAll();
    }

    @GetMapping("/{id}")
    Users getUser(@PathVariable int id) throws UserNotFoundException
    {
        return service.getUser(id);
    }
    
}
