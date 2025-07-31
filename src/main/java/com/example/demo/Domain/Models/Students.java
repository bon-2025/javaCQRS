package com.example.demo.Domain.Models;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Students {
    private int id;
    private String name;
    private String email;
    private String password;

    public void setStudents(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
