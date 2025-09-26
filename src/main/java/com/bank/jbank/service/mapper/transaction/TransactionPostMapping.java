package com.bank.jbank.service.mapper.transaction;

import com.bank.jbank.model.dto.transaction.TransactionPostDTO;
import com.bank.jbank.model.entity.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface TransactionPostMapping {
    Transaction toEntity(TransactionPostDTO transactionPostDTO);

    TransactionPostDTO toDTO(Transaction transaction);
}
