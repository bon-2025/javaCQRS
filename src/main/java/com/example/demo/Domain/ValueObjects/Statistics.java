package com.example.demo.Domain.ValueObjects;

import com.example.demo.Domain.Contracts.Repository;
import com.example.demo.Infrastucture.Database.Repository.AdminRepository;
import org.springframework.stereotype.Service;

@Service
public class Statistics implements Repository {
    public AdminRepository adminRepository;

    public Statistics(AdminRepository adminRepository){
        this.adminRepository = adminRepository;
    }

    @Override
    public Long getTotalCountOfDescendants(){
        return adminRepository.countDescendants();
    }

}
