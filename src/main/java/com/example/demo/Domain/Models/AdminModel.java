package com.example.demo.Domain.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminModel {

    private String firstName;
    private String lastName;
    private String birthDay;
    private String deathDay;
    private String dateOfInternment;
    private String gender;
    private String addressOfInternment;
    private Long burialPermitNumber;


    public AdminModel(String firstName, String lastName, String birthDay, String deathDay,  String dateOfInternment, String gender, String addressOfInternment,  Long burialPermitNumber) {
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
