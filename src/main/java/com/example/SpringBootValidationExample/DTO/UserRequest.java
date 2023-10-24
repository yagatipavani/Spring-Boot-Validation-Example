package com.example.SpringBootValidationExample.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class UserRequest {
    private String name;
    private String email;
    private int age;
    private Date registerDate;
}