package com.bank.jbank.model.mapper.address;

import com.bank.jbank.model.dto.address.AddressPostDTO;
import com.bank.jbank.model.entity.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressPostMapping {
    Address toEntity(AddressPostDTO addressPostDTO);

    AddressPostDTO toDTO(Address address);
}
