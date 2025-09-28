package com.example.demo.Domain.Common.Admin;

import com.example.demo.Domain.Models.Descendants;
import com.example.demo.Infrastucture.Database.Entities.DescendantsTable.*;
import org.springframework.stereotype.Service;

@Service
public class DescendantsMapper {

    public DescendantEntities mapDescendants(Descendants descendants){
        DescendantEntities descendantEntities = new DescendantEntities();
        descendantEntities.setBurialPermitNumber(descendants.getBurialPermitNumber().getId());
        return descendantEntities;
    }
    public AddressEntities mapAddresses(Descendants descendants){
        AddressEntities addressEntities = new AddressEntities();

        //addressEntities.setBurialPermitNumber(descendants.getBurialPermitNumber().getId());
        addressEntities.setProvince(descendants.getAddress().getProvinceOfDescendants());
        addressEntities.setFullName(descendants.getProfile().getFirstName() + " " + descendants.getProfile().getLastName());
        addressEntities.setBarangay(descendants.getAddress().getBarangayOfDescendants());
        addressEntities.setCity_municipalities(descendants.getAddress().getCity_municipalitiesOfDescendants());
        return addressEntities;
    }
    public ContactEntities mapContact(Descendants descendants){
        ContactEntities contactEntities  = new ContactEntities();

        //contactEntities.setBurialPermitNumber(String.valueOf(descendants.getBurialPermitNumber().getId()));
        contactEntities.setContactName(descendants.getProfile().getFirstName() + " " + descendants.getProfile().getLastName());
        contactEntities.setContactNumber(descendants.getContact().getContactNumber());
        return contactEntities;
    }
    public AddressEntities mapContactAddress(Descendants descendants){
        AddressEntities addressEntities = new AddressEntities();
        //addressEntities.setBurialPermitNumber(String.valueOf(descendants.getBurialPermitNumber().getId()));
        addressEntities.setRegion(descendants.getAddress().getRegionOfDescendants());
        addressEntities.setProvince(descendants.getAddress().getProvinceOfDescendants());
        addressEntities.setCity_municipalities(descendants.getAddress().getCity_municipalitiesOfDescendants());
        addressEntities.setBarangay(descendants.getAddress().getBarangayOfDescendants());
        return addressEntities;
    }
    public DateEntites mapBirthDate(Descendants descendants){
        DateEntites dateEntities  = new DateEntites();
        //dateEntities.setBurialPermitNumber(descendants.getBurialPermitNumber().getId());
        dateEntities.setDay(descendants.getDateOfBirth().getDay());
        dateEntities.setMoth(descendants.getDateOfBirth().getMonth());
        dateEntities.setYear(descendants.getDateOfBirth().getYear());
        return dateEntities;
    }
    public DateEntites mapDeathDate(Descendants descendants){
        DateEntites dateEntities = new DateEntites();
        //dateEntities.setBurialPermitNumber(descendants.getBurialPermitNumber().getId());
        dateEntities.setDay(descendants.getDateOfDeath().getDay());
        dateEntities.setMoth(descendants.getDateOfDeath().getMonth());
        dateEntities.setYear(descendants.getDateOfDeath().getYear());
        return dateEntities;
    }
    public ProfileEntities mapProfile(Descendants descendants){
        ProfileEntities profileEntities  = new ProfileEntities();
       // profileEntities.setBurialPermitNumber(descendants.getBurialPermitNumber().getId());
        profileEntities.setFirstName(descendants.getProfile().getFirstName());
        profileEntities.setLastName(descendants.getProfile().getLastName());
        profileEntities.setGender(descendants.getProfile().getGender());
        return profileEntities;
    }
}
