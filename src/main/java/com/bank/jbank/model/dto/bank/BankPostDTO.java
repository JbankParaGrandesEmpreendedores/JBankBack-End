package com.bank.jbank.model.dto.bank;

import com.bank.jbank.model.entity.Address;

public record BankPostDTO(
        String name,
        Address address
) {
}
