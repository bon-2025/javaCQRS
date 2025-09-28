package com.example.demo.Infrastucture.Database.Repository.Descendants;

import com.example.demo.Infrastucture.Database.Entities.DescendantsTable.ContactEntities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<ContactEntities, Long> {
}
