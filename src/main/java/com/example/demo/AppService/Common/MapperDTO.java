package com.example.demo.AppService.Common;

import com.example.demo.AppService.DTOs.Students.LoginStudentsDTO;
import com.example.demo.AppService.DTOs.StudentsDTO;
import com.example.demo.Domain.Models.Students;
import com.example.demo.Infrastucture.Database.Entities.StudentsTable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class MapperDTO {

    public static StudentsDTO toDTO(StudentsTable student) {
        return new StudentsDTO(student.getEmail(), student.getName(), student.getAge());
    }
    public static List<StudentsDTO> toDTOList(List<StudentsTable> entities) {
        return entities.stream()
                .map(MapperDTO::toDTO)
                .collect(Collectors.toList());
    }

}
