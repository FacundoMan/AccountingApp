package com.accounting.application.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accounting.application.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long>{

    List<Expense> findByDateBetween(LocalDate start, LocalDate end);
}
