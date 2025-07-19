package com.bank.jbank.model.mapper.agency;

import com.bank.jbank.model.dto.agency.AgencyPostDTO;
import com.bank.jbank.model.entity.Agency;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AgencyPostMapping {
    Agency toEntity(AgencyPostDTO agencyPostDTO);

    AgencyPostDTO toDTO(Agency agency);
}
