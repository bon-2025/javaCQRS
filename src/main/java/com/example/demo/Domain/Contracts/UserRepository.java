package com.example.demo.Domain.Contracts;

import com.example.demo.Infrastucture.Database.Entities.DescendantTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<DescendantTable, Long>{
    //StudentsTable findAllById(Long id);
}
