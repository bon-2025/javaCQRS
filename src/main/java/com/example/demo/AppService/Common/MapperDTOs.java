package com.example.demo.AppService.Common;

import com.example.demo.AppService.DTOs.DescendantsDTOs;
import com.example.demo.Core.ViewModel.DescendantsModel;
import org.springframework.stereotype.Service;

@Service
public class MapperDTOs {
    public DescendantsModel map(DescendantsDTOs dtos) {
        return new DescendantsModel(
                dtos.getBurialPermitNumber(),
                dtos.getFirstName(),
                dtos.getLastName(),
                dtos.getGender(),

                dtos.getDayOfBirth(),
                dtos.getMonthOfBirth(),
                dtos.getYearOfBirth(),

                dtos.getDayOfDeath(),
                dtos.getMonthOfDeath(),
                dtos.getYearOfDeath(),

                dtos.getContactName(),
                dtos.getContactNumber(),
                dtos.getRegionOfContact(),
                dtos.getProvinceOfContact(),
                dtos.getCity_municipalitiesOfContact(),
                dtos.getBarangayOfContact(),

                dtos.getRegionOfDescendants(),
                dtos.getProvinceOfDescendants(),
                dtos.getCity_municipalitiesOfDescendants(),
                dtos.getBarangayOfDescendants()
        );
    }
}
