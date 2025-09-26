package com.bank.jbank.model.entity;

import com.bank.jbank.model.Enum.AccountStatusEnum;
import com.bank.jbank.model.Enum.AccountTypeEnum;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer accountNumber;
    private AccountTypeEnum accountType;
    private AccountStatusEnum accountStatus;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @OneToMany(mappedBy = "sender")
    private List<Transaction> sentTransactions;
    @OneToMany(mappedBy = "receiver")
    private List<Transaction> receivedTransaction;

}
