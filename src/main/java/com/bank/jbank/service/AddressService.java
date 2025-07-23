package com.bank.jbank.service;

import com.bank.jbank.model.entity.Address;
import com.bank.jbank.repository.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddressService {
    private AddressRepository repository;

    public Address getAddress(Integer id){
        return repository.findById(id).get();
    }

    public Page<Address> getAllAddresses(Pageable pageable){
        return repository.findAll(pageable);
    }
}
