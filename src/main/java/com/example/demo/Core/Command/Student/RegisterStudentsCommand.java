package com.example.demo.Core.Command.Student;

import lombok.Data;


@Data
public class RegisterStudentsCommand {
    private Long id;
    private String name;
    private String age;

    public RegisterStudentsCommand(Long id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
