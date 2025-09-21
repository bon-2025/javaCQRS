package com.example.demo.Core.QueryHandler;

import com.example.demo.Core.Queries.QueryInterface;
import org.springframework.stereotype.Component;

@Component
public class StudentsHandler implements QueryInterface {

    @Override
    public Long getContractStatus() {
        return 0L;
    }
}
