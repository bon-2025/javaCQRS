package com.example.demo.Infrastucture.Database.Repository.Descendants;

import com.example.demo.Infrastucture.Database.Entities.DescendantsTable.ProfileEntities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<ProfileEntities, Long> {
}
