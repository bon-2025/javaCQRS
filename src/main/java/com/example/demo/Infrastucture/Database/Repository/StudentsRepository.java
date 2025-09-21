package com.example.demo.Infrastucture.Database.Repository;

import com.example.demo.Domain.Contracts.UserRepository;
import com.example.demo.Infrastucture.Database.Entities.DescendantTable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsRepository {
    private final UserRepository repo;

    public StudentsRepository(UserRepository repo) {
        this.repo = repo;
    }

    public List<DescendantTable> getAllStudents() {
        return repo.findAll();
    }

}
