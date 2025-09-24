package com.example.demo.WebAPI.Controller;

import com.example.demo.AppService.DTOs.Admin.RegisterRecords;
import com.example.demo.AppService.DTOs.AdminDTOs;
import com.example.demo.AppService.Profiles.Admin.GetRecordsByName;
import com.example.demo.Domain.Models.AdminModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class AdminController {
    public GetRecordsByName getRecordsByName;
    public RegisterRecords registerDescendants;

    public AdminController(GetRecordsByName getRecordsByName, RegisterRecords registerDescendants) {
        this.getRecordsByName = getRecordsByName;
        this.registerDescendants = registerDescendants;
    }

    @PostMapping("/register")
    public String registerDescendants(@RequestBody AdminDTOs adminDTOs){
        return registerDescendants.registerRecords(adminDTOs);
    }

    @GetMapping("/getName")
    public List<AdminModel> getRecordsByName(){
        return getRecordsByName.getRecordsByName();
    }
}
