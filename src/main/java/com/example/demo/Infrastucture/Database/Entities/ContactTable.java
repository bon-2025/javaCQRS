package com.example.demo.Infrastucture.Database.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ContactTable {
    @Id
    private Long burialPermitNumber;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String gender;
    private String currentAddress;
}
