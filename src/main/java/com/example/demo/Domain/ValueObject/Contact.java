package com.example.demo.Domain.ValueObject;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class Contact {
    private String contactName;
    private String contactNumber;
    private String regionOfContact;
    private String provinceOfContact;
    private String city_municipalitiesOfContact;
    private String barangayOfContact;

    public void setContact(String contactNumber, String contactName, String regionOfContact, String barangayOfContact,  String provinceOfContact, String city_municipalitiesOfContact) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
        this.regionOfContact = regionOfContact;
        this.barangayOfContact = barangayOfContact;
        this.provinceOfContact = provinceOfContact;
        this.city_municipalitiesOfContact = city_municipalitiesOfContact;
    }
}
