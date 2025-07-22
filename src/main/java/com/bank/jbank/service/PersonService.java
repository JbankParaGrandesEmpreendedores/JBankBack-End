package com.bank.jbank.service;

import com.bank.jbank.model.dto.person.PersonPostDTO;
import com.bank.jbank.model.entity.Person;
import com.bank.jbank.model.mapper.Person.PersonPostMapping;
import com.bank.jbank.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PersonService {

    private PersonPostMapping mapping;
    private PersonRepository repository;

    public Person create(PersonPostDTO dto){
        Person person = mapping.toEntity(dto);
        return repository.save(person);
    }

    public Person get(Integer id){
        return repository.getById(id);
    }

    public Page<Person> getAll(Pageable pageable){
        return repository.findAll(pageable);
    }

    public Person update(Integer id, PersonPostDTO dto){
        Optional<Person> optionalPerson = repository.findById(id);
        Person person = optionalPerson.get();
        person.setName(dto.name());
        person.setEmail(dto.email());
        person.setAddress(dto.address());
        person.setTelefone(dto.telephone());
        return repository.save(person);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }
}
