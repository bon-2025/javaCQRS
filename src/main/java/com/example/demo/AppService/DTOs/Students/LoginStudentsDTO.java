package com.example.demo.AppService.DTOs.Students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginStudentsDTO {
    public int id;
    public String email;
    public String name;


    public void setForm(int id, String name, String email) {
        this.id = id;
        this.email = email;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
}
