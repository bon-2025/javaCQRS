package com.example.demo.AppService.DTOs;

import lombok.Getter;

public class StudentsDTO {
    @Getter
    private String email;
    @Getter
    private String name;
    @Getter
    private String age;

    public StudentsDTO(String email,String name, String age) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

}
