package com.bank.jbank.model.mapper.bank;

import com.bank.jbank.model.dto.bank.BankPostDTO;
import com.bank.jbank.model.entity.Bank;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankPostMapping {
    Bank toDTO(BankPostDTO dto);

    BankPostDTO toEntity(Bank bank);
}
