package com.bank.jbank.model.dto.agency;

import com.bank.jbank.model.entity.Address;

public record AgencyPostDTO(
        String name,
        AddressPostDTO addressPostDTO
) {
}
