package com.example.demo.Domain.ValueObject;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class Address {
    private String regionOfDescendants;
    private String provinceOfDescendants;
    private String city_municipalitiesOfDescendants;
    private String barangayOfDescendants;

    public void setAddress(String region, String province, String city, String barangay) {
        this.regionOfDescendants = region;
        this.provinceOfDescendants = province;
        this.city_municipalitiesOfDescendants = city;
        this.barangayOfDescendants = barangay;
    }
}
