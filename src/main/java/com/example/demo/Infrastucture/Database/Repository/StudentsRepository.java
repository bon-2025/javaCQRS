package com.example.demo.Infrastucture.Database.Repository;

import com.example.demo.Domain.Contracts.UserRepository;
import com.example.demo.Infrastucture.Database.Entities.StudentsTable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsRepository {
    private final UserRepository repo;

    public StudentsRepository(UserRepository repo) {
        this.repo = repo;
    }

    public List<StudentsTable> getAllStudents() {
        return repo.findAll();
    }

}
