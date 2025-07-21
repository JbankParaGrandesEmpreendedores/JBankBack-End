package com.bank.jbank.service;

import com.bank.jbank.model.dto.person.PersonPostDTO;
import com.bank.jbank.model.entity.Person;
import com.bank.jbank.model.mapper.Person.PersonPostMapping;
import com.bank.jbank.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Person> getAll(){
        return repository.findAll();
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }
}
