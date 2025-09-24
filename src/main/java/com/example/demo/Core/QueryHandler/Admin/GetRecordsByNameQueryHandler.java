package com.example.demo.Core.QueryHandler.Admin;

import com.example.demo.Core.Queries.QueryInterface;
import com.example.demo.Domain.Contracts.AdminContracts;
import com.example.demo.Domain.Models.AdminModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetRecordsByNameQueryHandler implements QueryInterface {
    public AdminContracts adminContracts;

    public GetRecordsByNameQueryHandler(AdminContracts adminContracts) {
        this.adminContracts = adminContracts;
    }

    @Override
    public List<AdminModel> getRecordsByName(){
        return adminContracts.getRecordsByName();
    }
}
