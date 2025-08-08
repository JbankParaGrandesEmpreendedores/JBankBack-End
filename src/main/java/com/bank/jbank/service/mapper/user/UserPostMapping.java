package com.bank.jbank.service.mapper.user;

import com.bank.jbank.model.dto.user.UserPostDTO;
import com.bank.jbank.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserPostMapping {

    User toEntity(UserPostDTO userPostDTO);

    UserPostDTO toDTO(User user);

    void put(UserPostDTO userPostDTO, @MappingTarget User user);
}
