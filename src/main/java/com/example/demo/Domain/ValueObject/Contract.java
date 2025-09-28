package com.example.demo.Domain.ValueObject;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class Contract {
    private String renewalDate;

    public void setContract(String  renewalDate) {
        this.renewalDate = renewalDate;
    }
}
