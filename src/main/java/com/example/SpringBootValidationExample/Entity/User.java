package com.example.SpringBootValidationExample.Entity;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private int age;
    @JsonFormat(shape =Shape.STRING, pattern = "dd/mm/yyyy")
    private Date registerDate;
}
