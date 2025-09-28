package com.example.demo.WebAPI.ApplicationController;

import com.example.demo.AppService.DTOs.Admin.AdminService;
import com.example.demo.AppService.DTOs.DescendantsDTOs;
import com.example.demo.AppService.Profiles.Admin.GetCountOfDescendantsByDate;
import com.example.demo.Domain.Models.DateDescendantsCount;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AdminController {

    public AdminService adminService;
    public GetCountOfDescendantsByDate getCountDescendantsByWeek;

    public AdminController(AdminService adminService, GetCountOfDescendantsByDate getCountDescendantsByWeek){
        this.adminService = adminService;
        this.getCountDescendantsByWeek = getCountDescendantsByWeek;
    }
    @PostMapping("/register")
    public String registerDescendants(@RequestBody DescendantsDTOs descendantsDTOs) {
       return adminService.registerRecords(descendantsDTOs);
    }

    @GetMapping("/admin")
    public List<DateDescendantsCount> getRecordsByName(){
        return getCountDescendantsByWeek.getCount();
    }

}
