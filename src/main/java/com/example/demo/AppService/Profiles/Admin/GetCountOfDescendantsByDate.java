package com.example.demo.AppService.Profiles.Admin;

import com.example.demo.Core.Queries.QueryInterface;
import com.example.demo.Core.QueryHandler.Admin.getCountDescendantsByDateHandler;
import com.example.demo.Domain.Models.DateDescendantsCount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetCountOfDescendantsByDate {
    public QueryInterface query;

    public GetCountOfDescendantsByDate(getCountDescendantsByDateHandler getCountDescendantsByWeek ){
        this.query = getCountDescendantsByWeek;
    }

    public List<DateDescendantsCount> getCount(){
        return query.getTotalOfDescendantsByWeek();
    }

}
