package com.example.demo.validation;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Input {
    @NotBlank(message = "please enter a username!" )
    private String username;
    @Size(min = 6 , message = "password must include at least 8 characters")
    private String password;
    @Email(message = "please enter a valid E-mail!" , regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")
    private String email;

    public Input(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
