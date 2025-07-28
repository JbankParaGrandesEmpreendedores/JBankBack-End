package com.bank.jbank.service.mapper.agency;

import com.bank.jbank.model.dto.agency.AgencyPostDTO;
import com.bank.jbank.model.entity.Agency;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface AgencyPostMapping {
    Agency toEntity(AgencyPostDTO agencyPostDTO);

    AgencyPostDTO toDTO(Agency agency);

    void updateEntity(AgencyPostDTO agencyPostDTO, @MappingTarget Agency existingAgency);
}
