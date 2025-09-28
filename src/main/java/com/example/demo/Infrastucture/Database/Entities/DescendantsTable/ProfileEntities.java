package com.example.demo.Infrastucture.Database.Entities.DescendantsTable;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Entity
@Service
public class ProfileEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String gender;

    @OneToOne
    @JoinColumn(name = "descendant_entities_id", unique = true)
    private DescendantEntities descendantEntities;

}
