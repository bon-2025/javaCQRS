package com.example.demo.Infrastucture.Database.Entities.DescendantsTable;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Entity
@Service
public class DateEntites {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private int day;
    private int moth;
    private int year;

    @OneToOne
    @JoinColumn(name = "descendant_entities_id", unique = true)
    private DescendantEntities descendantEntities;
}
