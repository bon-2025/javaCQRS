package com.example.demo.Infrastucture.Database.Entities.DescendantsTable;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Service;


@Data
@Entity
@Service
public class DescendantEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String burialPermitNumber;


}
