package com.example.demo.Core.ViewModels;

import com.example.demo.Core.Queries.QueryInterface;
import com.example.demo.Domain.Contracts.Repository;
import org.springframework.stereotype.Service;

@Service
public class AdminViewModels implements QueryInterface {
    public Repository repo;

    public AdminViewModels(Repository repo) {
        this.repo = repo;
    }

    @Override
    public Long getContractStatus() {
        return repo.getTotalCountOfDescendants();
    }
}
