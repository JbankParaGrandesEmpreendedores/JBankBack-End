package com.bank.jbank.model.dto.loan;

public record LoanPostDTO(

        float amount,
        float tax,
        int prompt,
        String status

) {
}
