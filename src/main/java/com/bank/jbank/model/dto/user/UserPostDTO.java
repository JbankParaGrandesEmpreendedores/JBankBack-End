package com.bank.jbank.model.dto.user;

import com.bank.jbank.model.Enum.AccountStatusEnum;
import com.bank.jbank.model.Enum.AccountTypeEnum;
import com.bank.jbank.model.dto.person.PersonPostDTO;
import com.bank.jbank.model.entity.Person;
import jakarta.persistence.*;

public record UserPostDTO(
        Integer id,
        Integer accountNumber,
        AccountTypeEnum accountType,
        AccountStatusEnum accountStatus,
        PersonPostDTO personPostDTO
) {
}
