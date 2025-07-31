package com.example.demo.Domain.ValueObjects;

public class StudentsValue {
    private final String name;
    private final String age;

    public StudentsValue(String name, String age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getAge(){
        return age;
    }
}
