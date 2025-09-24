package com.example.demo.Domain.Contracts;

import com.example.demo.Domain.Models.AdminModel;
import com.example.demo.Infrastucture.Database.Entities.DescendantTable;
import com.example.demo.Infrastucture.Database.Repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminContracts {

    public AdminRepository adminRepository;
    public DescendantTable descendantTable;

    public AdminContracts(AdminRepository adminRepository, DescendantTable descendantTable) {
        this.adminRepository = adminRepository;
        this.descendantTable = descendantTable;
    }

    public String CreateRecords(AdminModel adminModel)
    {
        descendantTable.setDescendant(
                adminModel.getFirstName(),
                adminModel.getLastName(),
                adminModel.getBirthDay(),
                adminModel.getDeathDay(),
                adminModel.getDateOfInternment(),
                adminModel.getGender(),
                adminModel.getAddressOfInternment(),
                adminModel.getBurialPermitNumber()
        );

        adminRepository.save(descendantTable);

        return "Register Complete :" + descendantTable.getFirstName();
    }
    public List<AdminModel> getRecordsByName() {
        List<DescendantTable> list = adminRepository.findByFirstName("helo");
        return list.stream()
                .map(l -> new AdminModel(
                        l.getFirstName(),
                        l.getLastName(),
                        l.getBirthDay(),
                        l.getDeathDay(),
                        l.getDateOfInternment(),
                        l.getGender(),
                        l.getAddressOfInternment(),
                        l.getBurialPermitNumber()

                ))
                .collect(Collectors.toList());
    }
}
