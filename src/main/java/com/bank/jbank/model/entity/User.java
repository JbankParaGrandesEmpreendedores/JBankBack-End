package com.bank.jbank.model.entity;

import com.bank.jbank.model.Enum.AccountStatusEnum;
import com.bank.jbank.model.Enum.AccountTypeEnum;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
