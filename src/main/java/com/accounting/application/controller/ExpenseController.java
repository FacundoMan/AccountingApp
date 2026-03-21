package com.accounting.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accounting.application.model.Expense;
import com.accounting.application.service.ExpenseService;
@RestController
@RequestMapping("/expenses")
public class ExpenseController {
 @Autowired
    private ExpenseService expenseService;

    @PostMapping
    public Expense create(@RequestBody Expense expense) {
        return expenseService.save(expense);
    }

    @GetMapping
    public List<Expense> getAll() {
        return expenseService.findAll();
    }
}
