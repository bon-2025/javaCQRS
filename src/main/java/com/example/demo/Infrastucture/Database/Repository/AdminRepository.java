package com.example.demo.Infrastucture.Database.Repository;

import com.example.demo.Infrastucture.Database.Entities.DescendantTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdminRepository extends JpaRepository<DescendantTable, Long> {
    List<DescendantTable> findByFirstName(String firstName);
}
