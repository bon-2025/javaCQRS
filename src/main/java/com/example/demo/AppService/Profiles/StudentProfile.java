package com.example.demo.AppService.Profiles;

import com.example.demo.AppService.DTOs.StudentsDTO;
import com.example.demo.Core.QueryHandler.Students.StudentsHandler;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class StudentProfile {
    public StudentsHandler handler;

    public StudentProfile(StudentsHandler handler){
        this.handler = handler;
    }
    public List<StudentsDTO> allStudentsDTO(){
        return handler.getAllstudentsDTO();
    }
}
