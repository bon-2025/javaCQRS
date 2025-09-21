package com.example.demo.Infrastucture.Database.Repository;

import com.example.demo.Infrastucture.Database.Entities.DescendantTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminRepository extends JpaRepository<DescendantTable, Long> {
    @Query("SELECT COUNT(*) DescendantTable")
    Long countDescendants();
}
