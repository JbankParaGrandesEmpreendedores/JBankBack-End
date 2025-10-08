package com.bank.jbank.controller;

import com.bank.jbank.model.dto.loan.LoanPostDTO;
import com.bank.jbank.model.entity.Loan;
import com.bank.jbank.service.LoanService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("/loan")
public class LoanContoller {

    private LoanService service;

    @GetMapping("/{id}")
    public ResponseEntity<Loan> get(@PathVariable Integer id){
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping()
    public ResponseEntity<Page<Loan>> getAll(Pageable pageable){
        return ResponseEntity.ok(service.getAll(pageable));
    }

    @PostMapping()
    public ResponseEntity<Loan> post(@RequestBody LoanPostDTO dto){
        return ResponseEntity.ok(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Loan> put(@PathVariable Integer id, @RequestBody LoanPostDTO dto){
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        service.delete(id);
        return "Deleted id: " + id + " from the database";
    }
}
