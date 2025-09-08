package com.bank.jbank.model.dto.transaction;

import com.bank.jbank.model.Enum.TransactionTypeEnum;
import com.bank.jbank.model.entity.User;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public record TransactionPostDTO(
        Double value,
        LocalDateTime date,
        TransactionTypeEnum transactionTyp,
        User sender,
        User receiver
) {
}
