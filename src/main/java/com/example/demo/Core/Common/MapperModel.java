package com.example.demo.Core.Common;

import com.example.demo.Core.ViewModel.DescendantsModel;
import com.example.demo.Domain.Models.Descendants;
import com.example.demo.Domain.ValueObject.*;
import org.springframework.stereotype.Service;

@Service
public class MapperModel {
    public BurialPermitNumber burialPermitNumber;
    public Profile profile;
    public Address address;
    public Contact contact;
    public Date dateOfBirth;
    public Date dateOfDeath;

    public MapperModel(BurialPermitNumber burialPermitNumber, Profile profile, Contact contact, Date dateOfBirth, Date dateOfDeath, Address address){
        this.burialPermitNumber = burialPermitNumber;
        this.profile = profile;
        this.address = address;
        this.contact = contact;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
    }
    public Descendants mapDescendants(DescendantsModel descendantsModel){
        profile.setProfile(
                descendantsModel.getFirstName(),
                descendantsModel.getLastName(),
                descendantsModel.getGender()
        );
        address.setAddress(
                descendantsModel.getRegionOfDescendants(),
                descendantsModel.getProvinceOfDescendants(),
                descendantsModel.getCity_municipalitiesOfContact(),
                descendantsModel.getBarangayOfDescendants()
        );

        contact.setContact(
                descendantsModel.getContactNumber(), descendantsModel.getContactName(),
                descendantsModel.getRegionOfContact(), descendantsModel.getBarangayOfContact(),
                descendantsModel.getProvinceOfContact(), descendantsModel.getCity_municipalitiesOfContact()
        );
        dateOfBirth.setDate(
                descendantsModel.getDayOfBirth(),
                descendantsModel.getMonthOfBirth(),
                descendantsModel.getYearOfBirth()
        );
        dateOfDeath.setDate(
                descendantsModel.getDayOfBirth(), descendantsModel.getMonthOfBirth(),
                descendantsModel.getYearOfBirth()
        );
        burialPermitNumber.setId(descendantsModel.getId());
        return new Descendants(burialPermitNumber, profile, address, contact, dateOfBirth, dateOfDeath);
    }
}
