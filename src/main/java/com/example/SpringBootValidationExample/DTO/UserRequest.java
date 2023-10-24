package com.example.SpringBootValidationExample.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class UserRequest {
    @NotNull(message = "Name shouldn't be Null")
    private String name;
    @Email(message = "Invalid Email")
    private String email;
    @Min(18)
    @Max(60)
    private int age;
    @NotBlank
    private String registerDate;
}