package com.example.demo.Core.Command;

public interface CommandInterface
{
    String registerRecordsCommand(String firstName, String lastName, String birthDay, String deathDay,  String dateOfInternment, String gender, String addressOfInternment, Long burialPermitNumber);
    String ClaimCommandCommand(Long burialPermitNumber, String firstName, String lastName);
    String EditRecordsCommandCommand(Long burialPermitNumber, String firstName, String lastName);
    Float getExpiredRecordsByWeekCommand();
    Float getExpiredRecordsByMonthCommand();
    Float getExpiredRecordsByYearCommand();
    Float getRecordsByWeekCommand();
    Float getRecordsByMonthCommand();
    Float getRecordsByYearCommand();
    String getRecordsByYearAndMonthCommand();
    String RenewedContractsCommand(Long burialPermitNumber, String firstName, String lastName);
    String ViewRecordsByNameCommand(Long burialPermitNumber, String firstName, String lastName);
}
