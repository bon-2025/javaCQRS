package com.example.demo.Core.QueryHandler.Admin;

import com.example.demo.Core.Queries.QueryInterface;
import com.example.demo.Domain.Aggregate.Admin.GetTotalDescendantsByDate;
import com.example.demo.Domain.Models.DateDescendantsCount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class getCountDescendantsByDateHandler implements QueryInterface {
    public GetTotalDescendantsByDate getTotalDescendantsByDate;

    public getCountDescendantsByDateHandler(GetTotalDescendantsByDate getTotalDescendantsByDate) {
        this.getTotalDescendantsByDate = getTotalDescendantsByDate;
    }

    @Override
    public List<DateDescendantsCount> getTotalOfDescendantsByWeek() {
        return getTotalDescendantsByDate.getTotalWeek();
    }
}
