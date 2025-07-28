package com.bank.jbank.service;

import com.bank.jbank.model.dto.agency.AgencyPostDTO;
import com.bank.jbank.model.entity.Agency;
import com.bank.jbank.service.mapper.agency.AgencyPostMapping;
import com.bank.jbank.repository.AddressRepository;
import com.bank.jbank.repository.AgencyRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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
        Agency existingAgency = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Not found"));
        agencyPostMapping.updateEntity(agencyPostDTO,existingAgency);
        return repository.save(existingAgency);
    }

    public void deleteAgency(Integer id){
        repository.deleteById(id);
    }
}
