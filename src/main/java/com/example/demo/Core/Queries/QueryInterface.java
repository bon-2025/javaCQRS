package com.example.demo.Core.Queries;

import com.example.demo.Domain.Models.AdminModel;

import java.util.List;

public interface QueryInterface {
    List<AdminModel> getRecordsByName();
}
