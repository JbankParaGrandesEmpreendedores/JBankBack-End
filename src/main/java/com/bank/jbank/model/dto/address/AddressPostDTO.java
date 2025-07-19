package com.bank.jbank.model.dto.address;

public record AddressPostDTO(
        Long cep,
        String state,
        String city,
        String avenue,
        Integer number
) {
}
