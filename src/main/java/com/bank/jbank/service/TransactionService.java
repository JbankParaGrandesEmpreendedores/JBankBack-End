package com.bank.jbank.service;

import com.bank.jbank.model.dto.transaction.TransactionPostDTO;
import com.bank.jbank.model.entity.Transaction;
import com.bank.jbank.repository.TransactionRepository;
import com.bank.jbank.service.mapper.transaction.TransactionPostMapping;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class TransactionService {
    private TransactionRepository repository;
    private TransactionPostMapping transactionPostMapping;

    public Transaction create(TransactionPostDTO transactionPostDTO){
        Transaction entity = transactionPostMapping.toEntity(transactionPostDTO);
        return repository.save(entity);
    }

    public Transaction get(Integer id){
        return repository.getById(id);
    }

    public Page<Transaction> getAll(Pageable pageable){
        return repository.findAll(pageable);
    }
}
