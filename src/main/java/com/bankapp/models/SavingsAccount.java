// SavingsAccount.java
package com.bankapp.models;

import jakarta.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class SavingsAccount extends Account {
    private BigDecimal interestRate;

    // Getters and Setters

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }
}
