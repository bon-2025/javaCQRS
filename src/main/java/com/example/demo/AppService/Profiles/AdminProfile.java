package com.example.demo.AppService.Profiles;

import com.example.demo.Core.ViewModels.AdminViewModels;
import org.springframework.stereotype.Service;

@Service
public class AdminProfile {
    public AdminViewModels query;

    public AdminProfile(AdminViewModels query){
        this.query = query;
    }
    public Long contractStatus(){
        return query.getContractStatus();
    }
}
