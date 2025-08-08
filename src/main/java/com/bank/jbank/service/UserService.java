package com.bank.jbank.service;

import com.bank.jbank.model.dto.user.UserPostDTO;
import com.bank.jbank.model.entity.User;
import com.bank.jbank.repository.UserRepository;
import com.bank.jbank.service.mapper.user.UserPostMapping;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository repository;
    private final UserPostMapping postMapping;

    public User create(UserPostDTO userPostDTO){
        User entity = postMapping.toEntity(userPostDTO);
        return repository.save(entity);
    }

    public User findById(Integer id){
        return repository.findById(id).get();
    }

    public Page<User> findAll(Pageable pageable){
        return repository.findAll(pageable);
    }

    public User put(Integer id, UserPostDTO userPostDTO){
        User existingUser = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found"));
        postMapping.put(userPostDTO,existingUser);
        return repository.save(existingUser);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

}
