package com.example.demo.Domain.Aggregate.Admin;

import com.example.demo.Domain.Models.DateDescendantsCount;
import com.example.demo.Infrastucture.Database.Repository.Descendants.ContractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GetTotalDescendantsByDate {
    public ContractRepository contractRepository;

    public GetTotalDescendantsByDate(ContractRepository contractRepository){
        this.contractRepository = contractRepository;
    }

    public List<DateDescendantsCount> getTotalWeek(){
        return contractRepository.descendantsCountWeekly();
    }

}
