package com.example.demo.Core.QueryHandler.Students;

import com.example.demo.AppService.Common.MapperDTO;
import com.example.demo.AppService.DTOs.StudentsDTO;
import com.example.demo.Infrastucture.Database.Repository.StudentsRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.List;

@Component
public class StudentsHandler {
    public StudentsRepository repo;

    public StudentsHandler(StudentsRepository repo){
        this.repo = repo;
    }

    public List<StudentsDTO> getAllstudentsDTO(){
        return MapperDTO.toDTOList(repo.getAllStudents());
    }
}
