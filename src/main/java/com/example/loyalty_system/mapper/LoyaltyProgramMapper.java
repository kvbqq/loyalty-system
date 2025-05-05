package com.example.loyalty_system.mapper;

import com.example.loyalty_system.dto.CreateLoyaltyProgramCommand;
import com.example.loyalty_system.dto.LoyaltyProgramDTO;
import com.example.loyalty_system.model.LoyaltyProgram;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LoyaltyProgramMapper {
    LoyaltyProgramDTO toDto(LoyaltyProgram program);
    LoyaltyProgram toEntity(CreateLoyaltyProgramCommand command);
}
