package com.bank.jbank.service;

import com.bank.jbank.model.dto.agency.AgencyPostDTO;
import com.bank.jbank.model.entity.Agency;
import com.bank.jbank.model.mapper.agency.AgencyPostMapping;
import com.bank.jbank.repository.AgencyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AgencyService {
    AgencyPostMapping agencyPostMapping;
    AgencyRepository agencyRepository;

    public Agency createAgency(AgencyPostDTO agencyPostDTO){
        Agency entity = agencyPostMapping.toEntity(agencyPostDTO);
        return agencyRepository.save(entity);
    }

    public Agency getAgency(Integer number){
        return agencyRepository.findAgencyByNumber(number);
    }

    public List<Agency> getAllAgencies(){
        return agencyRepository.findAll();
    }

    public Agency updateAgency(AgencyPostDTO agencyPostDTO){
        Agency entity = agencyPostMapping.toEntity(agencyPostDTO);
        return agencyRepository.save(entity);
    }
    public void deleteAgency(Integer number){
        agencyRepository.deleteByNumber(number);
    }
}
