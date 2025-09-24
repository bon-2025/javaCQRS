package com.example.demo.Core.CommandHandlers.Admin;

import com.example.demo.Core.Command.CommandInterface;
import com.example.demo.Domain.Contracts.AdminContracts;
import com.example.demo.Domain.Models.AdminModel;
import org.springframework.stereotype.Service;

@Service
public class RegisterRecordsCommandHandler implements CommandInterface {

    public AdminContracts adminContracts;

    public RegisterRecordsCommandHandler( AdminContracts adminContracts) {
        this.adminContracts = adminContracts;
    }


    @Override
    public String registerRecordsCommand(String firstName, String lastName, String birthDay, String deathDay,  String dateOfInternment, String gender, String addressOfInternment, Long burialPermitNumber)
    {
        AdminModel adminModel = new AdminModel(firstName, lastName, birthDay, deathDay, dateOfInternment, gender, addressOfInternment, burialPermitNumber);
        return adminContracts.CreateRecords(adminModel);
    }

    @Override
    public String ClaimCommandCommand(Long burialPermitNumber, String firstName, String lastName)
    {
        return "";
    }

    @Override
    public String EditRecordsCommandCommand(Long burialPermitNumber, String firstName, String lastName)
    {
        return "";
    }

    @Override
    public Float getExpiredRecordsByWeekCommand()
    {
        return 0f;
    }

    @Override
    public Float getExpiredRecordsByMonthCommand()
    {
        return 0f;
    }

    @Override
    public Float getExpiredRecordsByYearCommand()
    {
        return 0f;
    }

    @Override
    public Float getRecordsByWeekCommand()
    {
        return 0f;
    }

    @Override
    public Float getRecordsByMonthCommand()
    {
        return 0f;
    }

    @Override
    public Float getRecordsByYearCommand()
    {
        return 0f;
    }

    @Override
    public String getRecordsByYearAndMonthCommand()
    {
        return "";
    }

    @Override
    public String RenewedContractsCommand(Long burialPermitNumber, String firstName, String lastName)
    {
        return "";
    }

    @Override
    public String ViewRecordsByNameCommand(Long burialPermitNumber, String firstName, String lastName)
    {
        return "";
    }
}
