package com.example.demo.Infrastucture.Database.Repository.Descendants;

import com.example.demo.Domain.Models.DateDescendantsCount;
import com.example.demo.Infrastucture.Database.Entities.DescendantsTable.ContractEntities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContractRepository extends JpaRepository<ContractEntities, Long> {
    @Query(""" 
            SELECT
                FUNCTION('YEAR', C.createAt) AS year,
                FUNCTION('MONTH', C.createAt) AS month,
                FUNCTION('WEEK', C.createAt) AS week,
                COUNT(C) AS total
            FROM ContractEntities C
            GROUP BY FUNCTION('YEAR', C.createAt), FUNCTION('WEEK', C.createAt), FUNCTION('MONTH', C.createAt)
            ORDER BY year, month, week, total
            """)
    List<DateDescendantsCount> descendantsCountWeekly();
}
