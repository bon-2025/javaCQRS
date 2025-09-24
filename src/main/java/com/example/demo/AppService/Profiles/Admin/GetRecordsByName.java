package com.example.demo.AppService.Profiles.Admin;

import com.example.demo.Core.Queries.QueryInterface;
import com.example.demo.Core.QueryHandler.Admin.GetRecordsByNameQueryHandler;
import com.example.demo.Domain.Models.AdminModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetRecordsByName {

    public QueryInterface queryInterface;

    public GetRecordsByName(GetRecordsByNameQueryHandler getRecordsByNameQueryHandler) {
        this.queryInterface = getRecordsByNameQueryHandler;
    }

    public List<AdminModel> getRecordsByName() {
        return queryInterface.getRecordsByName();
    }
}
