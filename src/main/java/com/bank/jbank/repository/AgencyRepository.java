package com.bank.jbank.repository;

import com.bank.jbank.model.dto.agency.AgencyPostDTO;
import com.bank.jbank.model.entity.Agency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgencyRepository extends JpaRepository<Agency, Integer> {
    Agency toEntity(AgencyPostDTO agencyPostDTO);

    AgencyPostDTO toEntity(Agency agency);
}
