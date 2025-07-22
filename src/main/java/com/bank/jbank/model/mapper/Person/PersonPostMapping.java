package com.bank.jbank.model.mapper.Person;

import com.bank.jbank.model.dto.person.PersonPostDTO;
import com.bank.jbank.model.entity.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonPostMapping {
    Person toEntity(PersonPostDTO dto);
     PersonPostDTO toDTO(Person person);
}
