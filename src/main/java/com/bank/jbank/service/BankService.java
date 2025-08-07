package com.bank.jbank.service;

import com.bank.jbank.model.dto.bank.BankPostDTO;
import com.bank.jbank.model.entity.Bank;
import com.bank.jbank.repository.BankRepository;
import com.bank.jbank.service.mapper.bank.BankPostMapping;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
    
import java.util.Optional;

@Service
@AllArgsConstructor
public class BankService {

    private BankPostMapping mapping;
    private BankRepository bankRepository;

    public Bank create(BankPostDTO dto){
        Bank bank = mapping.toEntity(dto);
        return bankRepository.save(bank);
    }

    public Bank update(Integer id, BankPostDTO dto){
        Optional<Bank> bankOptional = bankRepository.findById(id);
        Bank bank = bankOptional.get();
        bank.setAddress(dto.address());
        bank.setName(dto.name());
        return bankRepository.save(bank);
    }

    public Bank get(Integer id){
        return bankRepository.findById(id).get();
    }

    public Page<Bank> getAll(Pageable pageable){
        return bankRepository.findAll(pageable);
    }

    public void delete(Integer id){
        bankRepository.deleteById(id);
    }
}
