package com.example.demo.Infrastucture.Database.Entities.DescendantsTable;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class ContractEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String burialPermitNumber;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createAt = LocalDateTime.now();


//    private LocalDateTime expiryDate = LocalDateTime.now().plusDays(60);
//    private String status = "Renewed";
}
