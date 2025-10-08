package com.bank.jbank.service;

import com.bank.jbank.model.dto.loan.LoanPostDTO;
import com.bank.jbank.model.entity.Loan;
import com.bank.jbank.repository.LoanRepository;
import com.bank.jbank.service.mapper.loan.LoanPostMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoanService {

    private LoanRepository repository;
    private LoanPostMapper mapper;

    public Loan create(LoanPostDTO dto){
        Loan loan = mapper.toEntity(dto);
        return repository.save(loan);
    }

    public Loan getById(Integer id){
        return repository.findById(id).get();
    }

    public Page<Loan> getAll(Pageable pageable){
        return repository.findAll(pageable);
    }

    public Loan update(Integer id, LoanPostDTO dto){
        Optional<Loan> loanOptional = repository.findById(id);
        Loan loan = loanOptional.get();
        mapper.put(dto, loan);
        return repository.save(loan);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

}
