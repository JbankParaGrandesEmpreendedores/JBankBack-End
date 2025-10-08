package com.bank.jbank.service.mapper.loan;

import com.bank.jbank.model.dto.loan.LoanPostDTO;
import com.bank.jbank.model.dto.user.UserPostDTO;
import com.bank.jbank.model.entity.Loan;
import com.bank.jbank.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface LoanPostMapper {

    Loan toEntity(LoanPostDTO dto);

    LoanPostDTO toDto(Loan loan);

    void put(LoanPostDTO dto, @MappingTarget Loan loan);

}
