package com.example.loyalty_system.mapper;

import com.example.loyalty_system.dto.CreateUserCommand;
import com.example.loyalty_system.dto.UserDTO;
import com.example.loyalty_system.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDto(User user);
    User toEntity(CreateUserCommand command);
}
