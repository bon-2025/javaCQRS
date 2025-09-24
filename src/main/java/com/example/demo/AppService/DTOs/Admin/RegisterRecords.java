package com.example.demo.AppService.DTOs.Admin;

import com.example.demo.AppService.DTOs.AdminDTOs;
import com.example.demo.Core.Command.CommandInterface;
import com.example.demo.Core.CommandHandlers.Admin.RegisterRecordsCommandHandler;
import org.springframework.stereotype.Service;

@Service
public class RegisterRecords {

    public CommandInterface commandInterface;

    public RegisterRecords(RegisterRecordsCommandHandler registerCommandHandler) {
        this.commandInterface = registerCommandHandler;
    }

    public String registerRecords(AdminDTOs adminDTOs)
    {
        return commandInterface.registerRecordsCommand(
                adminDTOs.getFirstName(),
                adminDTOs.getLastName(),
                adminDTOs.getBirthDay(),
                adminDTOs.getDeathDay(),
                adminDTOs.getDateOfInternment(),
                adminDTOs.getGender(),
                adminDTOs.getAddressOfInternment(),
                adminDTOs.getBurialPermitNumber()
        );
    }
}
