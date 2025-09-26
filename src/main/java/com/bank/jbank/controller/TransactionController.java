package com.bank.jbank.controller;

import com.bank.jbank.model.dto.transaction.TransactionPostDTO;
import com.bank.jbank.model.entity.Transaction;
import com.bank.jbank.service.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("transaction")
@AllArgsConstructor
public class TransactionController {
    private TransactionService service;

    @PostMapping
    public Transaction create(@RequestBody TransactionPostDTO transactionPostDTO){
        return service.create(transactionPostDTO);
    }

    @GetMapping("[id]")
    public Transaction getById(@RequestParam Integer id){
        return service.get(id);
    }

    @GetMapping
    public Page<Transaction> getAll(Pageable pageable){
        return service.getAll(pageable);
    }
}
