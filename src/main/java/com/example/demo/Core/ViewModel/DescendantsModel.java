package com.example.demo.Core.ViewModel;

import lombok.Data;

@Data
public class DescendantsModel {
    private String id;
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

    public DescendantsModel(String id, String firstName, String lastName, String gender, int dayOfBirth, int monthOfBirth, int yearOfBirth, int dayOfDeath, int monthOfDeath, int yearOfDeath, String contactName, String contactNumber, String regionOfContact, String provinceOfContact, String cityMunicipalitiesOfContact, String barangayOfContact, String regionOfDescendants, String provinceOfDescendants, String city_municipalitiesOfDescendants, String barangayOfDescendants) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.dayOfDeath = dayOfDeath;
        this.monthOfDeath = monthOfDeath;
        this.yearOfDeath = yearOfDeath;
        this.contactName = contactName;
        this.contactNumber = contactNumber;

        this.regionOfContact = regionOfContact;
        this.provinceOfContact = provinceOfContact;
        this.city_municipalitiesOfContact = cityMunicipalitiesOfContact;
        this.barangayOfContact = barangayOfContact;

        this.regionOfDescendants = regionOfDescendants;
        this.provinceOfDescendants = provinceOfDescendants;
        this.city_municipalitiesOfDescendants = city_municipalitiesOfDescendants;
        this.barangayOfDescendants = barangayOfDescendants;
    }
}
