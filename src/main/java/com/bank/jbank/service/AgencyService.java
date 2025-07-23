package com.bank.jbank.service;

import com.bank.jbank.model.dto.agency.AgencyPostDTO;
import com.bank.jbank.model.entity.Address;
import com.bank.jbank.model.entity.Agency;
import com.bank.jbank.model.mapper.agency.AgencyPostMapping;
import com.bank.jbank.repository.AddressRepository;
import com.bank.jbank.repository.AgencyRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AgencyService {
    private AgencyPostMapping agencyPostMapping;
    private AddressRepository addressRepository;
    private AgencyRepository repository;

    public Agency createAgency(AgencyPostDTO agencyPostDTO){
        Agency entity = agencyPostMapping.toEntity(agencyPostDTO);
        return repository.save(entity);
    }

    public Agency getAgency(Integer number){
        return repository.findAgencyByNumber(number);
    }

    public Page<Agency> getAllAgencies(Pageable pageable){
        return repository.findAll(pageable);
    }

    public Agency updateAgency(Integer id, AgencyPostDTO agencyPostDTO){
        Agency entity = agencyPostMapping.toEntity(agencyPostDTO);
        entity.setId(id);
        return repository.save(entity);
    }

    public void deleteAgency(Integer id){
        repository.deleteById(id);
    }
}
