package com.example.demo.Infrastucture.Database.Repository.Descendants;

import com.example.demo.Infrastucture.Database.Entities.DescendantsTable.DescendantEntities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DescendantRepository extends JpaRepository<DescendantEntities, Long> {

}
