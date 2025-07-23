package com.bank.jbank.controller;

import com.bank.jbank.model.dto.agency.AgencyPostDTO;
import com.bank.jbank.model.entity.Agency;
import com.bank.jbank.service.AgencyService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Agency")
@AllArgsConstructor
public class AgencyController {
    private AgencyService service;

    @PostMapping
    public ResponseEntity<Agency> createAgency(@RequestParam AgencyPostDTO agencyPostDTO){
        return ResponseEntity.ok(service.createAgency(agencyPostDTO));
    }

    @GetMapping("{number}")
    public ResponseEntity<Agency> getAgency(@PathVariable Integer number){
        return ResponseEntity.ok(service.getAgency(number));
    }

    @GetMapping
    public ResponseEntity<Page<Agency>> getAllAgencies(Pageable pageable){
        return ResponseEntity.ok(service.getAllAgencies(pageable));
    }

    @PutMapping("{id}")
    public ResponseEntity<Agency> updateAgency(@PathVariable Integer id, @RequestParam AgencyPostDTO agencyPostDTO){
        return ResponseEntity.ok(service.updateAgency(id, agencyPostDTO));
    }

    @DeleteMapping("{id}")
    public void deleteAgency(@PathVariable Integer id){
        service.deleteAgency(id);
    }
}
