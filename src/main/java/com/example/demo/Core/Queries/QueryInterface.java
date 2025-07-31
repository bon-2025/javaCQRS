package com.example.demo.Core.Queries;

import com.example.demo.Core.ViewModels.StudentsViewModels;
import com.example.demo.Infrastucture.Database.Entities.StudentsTable;

import java.util.List;

public interface QueryInterface {
    public List<StudentsViewModels> getAllstudents();
}
