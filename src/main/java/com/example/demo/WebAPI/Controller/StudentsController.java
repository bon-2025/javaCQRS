package com.example.demo.WebAPI.Controller;

import com.example.demo.AppService.DTOs.Students.LoginStudentsDTO;
import com.example.demo.AppService.DTOs.StudentsDTO;
import com.example.demo.AppService.Profiles.StudentProfile;
import com.example.demo.Domain.ValueObjects.StudentsValue;
import com.example.demo.Infrastucture.Database.Entities.StudentsTable;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/userwithS")
public class StudentsController {
    private final StudentProfile profile;

    public StudentsController(StudentProfile profile){
        this.profile = profile;
    }

    //@QueryMapping
    @GetMapping
    public List<StudentsDTO> getAllstudents() {
        return profile.allStudentsDTO();
    }

}
