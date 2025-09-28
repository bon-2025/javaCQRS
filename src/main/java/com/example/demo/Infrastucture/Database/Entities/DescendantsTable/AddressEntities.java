package com.example.demo.Infrastucture.Database.Entities.DescendantsTable;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Entity
@Service
public class AddressEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String region;
    private String province;
    private String city_municipalities;
    private String barangay;

    @OneToOne
    @JoinColumn(name = "descendant_entities_id", unique = true)
    private DescendantEntities descendantEntities;

}
