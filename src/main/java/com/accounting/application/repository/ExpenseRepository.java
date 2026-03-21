package com.accounting.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accounting.application.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
