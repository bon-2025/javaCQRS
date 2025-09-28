package com.example.demo.Core.Queries;

import com.example.demo.Domain.Models.DateDescendantsCount;

import java.util.List;

public interface QueryInterface {
    public List<DateDescendantsCount> getTotalOfDescendantsByWeek();
}
