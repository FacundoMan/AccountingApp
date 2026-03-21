package com.accounting.application.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accounting.application.model.BalanceResponse;
import com.accounting.application.model.Earning;
import com.accounting.application.model.Expense;
import com.accounting.application.repository.EarningRepository;
import com.accounting.application.repository.ExpenseRepository;

@Service
public class BalanceService {
    @Autowired
    private ExpenseRepository expenseRepository;
    @Autowired
    private EarningRepository earningRepository;

    public BalanceResponse getBalance(LocalDate start, LocalDate end) {
        List<Earning> earnings = earningRepository.findByDateBetween(start, end);
        List<Expense> expenses = expenseRepository.findByDateBetween(start, end);

        BigDecimal totalEarnings = earnings.stream()
                .map(Earning::getAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal totalExpenses = expenses.stream()
                .map(Expense::getAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal balance = totalEarnings.subtract(totalExpenses);

        return new BalanceResponse(totalEarnings, totalExpenses, balance);
    }
}
