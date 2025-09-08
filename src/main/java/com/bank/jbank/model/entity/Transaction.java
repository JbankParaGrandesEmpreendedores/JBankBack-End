package com.bank.jbank.model.entity;

import com.bank.jbank.model.Enum.TransactionTypeEnum;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private Double value;
    private LocalDateTime date;
    private TransactionTypeEnum transactionType;
    @ManyToOne
    private User sender;
    @ManyToOne
    private User receiver;
}
