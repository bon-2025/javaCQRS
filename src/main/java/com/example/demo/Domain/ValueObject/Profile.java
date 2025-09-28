package com.example.demo.Domain.ValueObject;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class Profile {
    private String firstName;
    private String lastName;
    private String gender;

    public void setProfile(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
}
