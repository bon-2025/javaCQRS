package com.example.demo.AppService.DTOs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
public class AdminDTOs {
    private String firstName;
    private String lastName;
    private String birthDay;
    private String deathDay;
    private String dateOfInternment;
    private String gender;
    private String addressOfInternment;
    private Long burialPermitNumber;
}
