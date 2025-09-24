package com.example.demo.Infrastucture.Database.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Entity
@Data
public class DescendantTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String firstName;
    private String lastName;
    private String birthDay;
    private String deathDay;
    private String dateOfInternment;
    private String gender;
    private String addressOfInternment;
    private Long burialPermitNumber;

    public void setDescendant(String firstName, String lastName, String birthDay,  String deathDay, String dateOfInternment, String gender, String addressOfInternment, Long burialPermitNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.deathDay = deathDay;
        this.dateOfInternment = dateOfInternment;
        this.gender = gender;
        this.addressOfInternment = addressOfInternment;
        this.burialPermitNumber = burialPermitNumber;
    }

}
