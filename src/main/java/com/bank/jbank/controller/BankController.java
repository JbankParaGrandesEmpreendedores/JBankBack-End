package com.bank.jbank.controller;

import com.bank.jbank.model.dto.bank.BankPostDTO;
import com.bank.jbank.model.entity.Bank;
import com.bank.jbank.service.BankService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/bank")
public class BankController {

    private BankService bankService;

    @GetMapping("/{id}")
    public ResponseEntity<Bank> getBank(@PathVariable Integer id){
        return ResponseEntity.ok(bankService.get(id));
    }

    @GetMapping
    public ResponseEntity<Page<Bank>> getBanks(Pageable pageable){
        return ResponseEntity.ok(bankService.getAll(pageable));
    }

    @PostMapping
    public ResponseEntity<Bank> createBank(@RequestBody BankPostDTO dto){
        return ResponseEntity.ok(bankService.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bank> updateBank(@PathVariable Integer id, @RequestBody BankPostDTO dto){
        return ResponseEntity.ok(bankService.update(id, dto));
    }

    @DeleteMapping
    public String deleteBank(@PathVariable Integer id){
        bankService.delete(id);
        return "id " + id + " Deleted";
    }
}
