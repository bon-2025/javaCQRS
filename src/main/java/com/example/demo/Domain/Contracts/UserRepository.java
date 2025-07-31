package com.example.demo.Domain.Contracts;

import com.example.demo.Infrastucture.Database.Entities.StudentsTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface UserRepository extends JpaRepository<StudentsTable, Long>{
    //StudentsTable findAllById(Long id);
}
