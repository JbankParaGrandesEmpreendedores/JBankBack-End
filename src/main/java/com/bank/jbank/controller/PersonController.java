package com.bank.jbank.controller;

import com.bank.jbank.model.dto.person.PersonPostDTO;
import com.bank.jbank.model.entity.Person;
import com.bank.jbank.model.mapper.Person.PersonPostMapping;
import com.bank.jbank.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/person")
public class PersonController {

    private PersonPostMapping mapping;
    private PersonService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> getPerson(@PathVariable Integer id){
        return ResponseEntity.ok(service.get(id));
    }

    @GetMapping()
    public ResponseEntity<Page<Person>> getAllPerson(Pageable pageable){
        return ResponseEntity.ok(service.getAll(pageable));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updatePerson(@PathVariable Integer id, @RequestBody PersonPostDTO dto){
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public String deletePerson(@PathVariable Integer id){
        service.delete(id);
        return "id " + id + " Deleted";
    }
}
