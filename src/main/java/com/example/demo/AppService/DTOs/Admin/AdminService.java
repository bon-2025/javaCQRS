package com.example.demo.AppService.DTOs.Admin;

import com.example.demo.AppService.Common.MapperDTOs;
import com.example.demo.AppService.DTOs.DescendantsDTOs;
import com.example.demo.Core.Command.CommandInterface;
import com.example.demo.Core.CommandHandlers.Admin.RegisterRecordsCommandHandler;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    public MapperDTOs mapper;
    public CommandInterface command;

    public AdminService(MapperDTOs mapper, RegisterRecordsCommandHandler commandHandler) {
        this.mapper = mapper;
        this.command = commandHandler;
    }

    public String registerRecords(DescendantsDTOs descendantsDTOs){
        return command.RegisterRecords(mapper.map(descendantsDTOs));
        //return mapper.map(descendantsDTOs) + "";
    }
}
