package com.bankapp.models;

import jakarta.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class CheckingAccount extends Account {

    public CheckingAccount() {
    }

    public CheckingAccount(BigDecimal balance, User user) {
        super(balance, user);
    }
}