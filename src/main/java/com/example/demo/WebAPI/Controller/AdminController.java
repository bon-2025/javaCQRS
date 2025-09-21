package com.example.demo.WebAPI.Controller;

import com.example.demo.AppService.Profiles.AdminProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    public AdminProfile adminProfile;

    public AdminController(AdminProfile adminProfile) {
        this.adminProfile = adminProfile;
    }

    @GetMapping("/")
    public Long getAdminProfile(){
        return adminProfile.contractStatus();
    }

}
