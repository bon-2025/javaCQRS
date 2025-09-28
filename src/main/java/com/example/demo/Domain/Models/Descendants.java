package com.example.demo.Domain.Models;

import com.example.demo.Domain.ValueObject.*;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class Descendants {
    public BurialPermitNumber burialPermitNumber;
    public Profile profile;
    public Address address;
    public Contact contact;
    public Date dateOfBirth;
    public Date dateOfDeath;

    public Descendants(BurialPermitNumber burialPermitNumber, Profile profile, Address address, Contact contact, Date dateOfBirth, Date  dateOfDeath) {
        this.burialPermitNumber = burialPermitNumber;
        this.profile = profile;
        this.address = address;
        this.contact = contact;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
    }
}
