package com.accounting.application.model;

import java.math.BigDecimal;

public class BalanceResponse { 
    private BigDecimal totalEarnings;
    private BigDecimal totalExpenses;
    private BigDecimal balance;
    public BalanceResponse() {

    }
    
    public BalanceResponse(BigDecimal totalEarnings, BigDecimal totalExpenses, BigDecimal balance) {
        this.totalEarnings = totalEarnings;
        this.totalExpenses = totalExpenses;
        this.balance = balance;
    }


    public BigDecimal getTotalEarnings() {
        return this.totalEarnings;
    }

    public void setTotalEarnings(BigDecimal totalEarnings) {
        this.totalEarnings = totalEarnings;
    }

    public BigDecimal getTotalExpenses() {
        return this.totalExpenses;
    }

    public void setTotalExpenses(BigDecimal totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }


}
