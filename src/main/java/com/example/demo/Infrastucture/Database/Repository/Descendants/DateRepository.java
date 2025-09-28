package com.example.demo.Infrastucture.Database.Repository.Descendants;

import com.example.demo.Infrastucture.Database.Entities.DescendantsTable.DateEntites;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DateRepository extends JpaRepository<DateEntites, Long> {
}
