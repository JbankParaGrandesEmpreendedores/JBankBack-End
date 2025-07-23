package com.bank.jbank.controller;

import com.bank.jbank.model.entity.Address;
import com.bank.jbank.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Address")
@AllArgsConstructor
public class AddressController {
    private AddressService service;

    @GetMapping("{id}")
    public ResponseEntity<Address> getAddress(@PathVariable Integer id){
        return ResponseEntity.ok(service.getAddress(id));
    }

    @GetMapping
    public ResponseEntity<Page<Address>> getAll(Pageable pageable){
        return ResponseEntity.ok(service.getAllAddresses(pageable));
    }
}
