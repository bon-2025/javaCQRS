package com.example.demo.Domain.ValueObject;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class Date {
    private int day;
    private int month;
    private int year;

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
