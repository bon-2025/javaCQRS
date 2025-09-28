package com.example.demo.Domain.Aggregate.Admin;

import com.example.demo.Domain.Common.Admin.DescendantsMapper;
import com.example.demo.Domain.Models.Descendants;
import com.example.demo.Infrastucture.Database.Repository.Descendants.*;
import org.springframework.stereotype.Service;

@Service
public class RegisterDescendants {
    public DescendantRepository descendantRepository;
    public AddressRepository addressRepository;
    public ContactRepository contactRepository;
    public DateRepository dateRepository;
    public ProfileRepository profileRepository;
    public DescendantsMapper descendantsMapper;


    public RegisterDescendants(AddressRepository addressRepository, ContactRepository contactRepository, DateRepository dateRepository, ProfileRepository profileRepository, DescendantRepository descendantRepository, DescendantsMapper descendantsMapper) {
        this.descendantRepository = descendantRepository;
        this.addressRepository = addressRepository;
        this.contactRepository = contactRepository;
        this.dateRepository = dateRepository;
        this.descendantsMapper = descendantsMapper;
        this.profileRepository = profileRepository;
    }
    public String RegisterRecords(Descendants descendants){
        descendantRepository.save(descendantsMapper.mapDescendants(descendants));
        addressRepository.save(descendantsMapper.mapAddresses(descendants));
        contactRepository.save(descendantsMapper.mapContact(descendants));
        dateRepository.save(descendantsMapper.mapBirthDate(descendants));
        dateRepository.save(descendantsMapper.mapDeathDate(descendants));
        profileRepository.save(descendantsMapper.mapProfile(descendants));

        return "success";
    }

}
