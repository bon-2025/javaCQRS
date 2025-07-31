package com.example.demo.Core.CommandHandlers.Students;

import com.example.demo.AppService.Common.MapperDTO;
import com.example.demo.AppService.DTOs.Students.CreateStudentsDTO;
import com.example.demo.Infrastucture.Database.Repository.StudentsRepository;


public class RegisterStudentsCommandHandlers {
    private final StudentsRepository userRepositoryImpl;
    private final MapperDTO mapper;

    public RegisterStudentsCommandHandlers(StudentsRepository userRepositoryImpl, MapperDTO mapper) {
        this.userRepositoryImpl = userRepositoryImpl;
        this.mapper = mapper;
    }

    public void registerStudents(CreateStudentsDTO student) {

    }
}
