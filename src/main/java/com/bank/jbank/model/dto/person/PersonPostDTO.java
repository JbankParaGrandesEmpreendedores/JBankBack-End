package com.bank.jbank.model.dto.person;

import com.bank.jbank.model.entity.Address;

public record PersonPostDTO(
        String name,
        String email,
        String telephone,
        Address address
) {
}
