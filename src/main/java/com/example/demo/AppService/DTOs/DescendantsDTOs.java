package com.example.demo.AppService.DTOs;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class DescendantsDTOs {
    private String burialPermitNumber;
    private String firstName;
    private String lastName;
    private String gender;

    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    private int dayOfDeath;
    private int monthOfDeath;
    private int yearOfDeath;

    private String contactName;
    private String contactNumber;
    private String regionOfContact;
    private String provinceOfContact;
    private String city_municipalitiesOfContact;
    private String barangayOfContact;

    private String regionOfDescendants;
    private String provinceOfDescendants;
    private String city_municipalitiesOfDescendants;
    private String barangayOfDescendants;

}
