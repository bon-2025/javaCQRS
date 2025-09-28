package com.example.demo.Domain.Models;

import lombok.Data;

@Data
public class DateDescendantsCount {
    private Integer year;
    private Integer week;
    private Integer month;
    private Long total;


    public DateDescendantsCount(Integer year, Integer month, Integer week, Long total){
        this.year = year;
        this.month = month;
        this.week = week;
        this.total = total;
    }

    public DateDescendantsCount(){}
}
