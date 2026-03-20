package com.accounting.application.model;

import java.math.BigDecimal;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name = "earnings")
public class Earning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customer;
    private LocalDate date;
    private String description;
    private BigDecimal amount;

    public Earning(Long id, String customer, LocalDate date, String description, BigDecimal amount) {
        this.id = id;
        this.customer = customer;
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    public Earning() {

    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomer() {
        return this.customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}
