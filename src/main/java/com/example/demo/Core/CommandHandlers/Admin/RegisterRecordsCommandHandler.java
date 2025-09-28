package com.example.demo.Core.CommandHandlers.Admin;

import com.example.demo.Core.Command.CommandInterface;
import com.example.demo.Core.Common.MapperModel;
import com.example.demo.Core.ViewModel.DescendantsModel;
import com.example.demo.Domain.Aggregate.Admin.RegisterDescendants;
import org.springframework.stereotype.Service;

@Service
public class RegisterRecordsCommandHandler implements CommandInterface {
    public MapperModel mapper;
    public RegisterDescendants  registerDescendants;

    public RegisterRecordsCommandHandler(RegisterDescendants registerDescendants, MapperModel mapper) {
        this.registerDescendants = registerDescendants;
        this.mapper = mapper;
    }
    public String RegisterRecords(DescendantsModel descendantsModel){
        return registerDescendants.RegisterRecords(mapper.mapDescendants(descendantsModel));
        //return mapper.mapDescendants(descendantsModel) + "";
    }

}
