package com.accounting.application.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accounting.application.model.BalanceResponse;
import com.accounting.application.service.BalanceService;

@RestController
@RequestMapping("/balance")
public class BalanceController {
    @Autowired
    private BalanceService balanceService;

   @GetMapping
public BalanceResponse getBalance(
    @RequestParam("start") LocalDate start,
    @RequestParam("end") LocalDate end
) {
    return balanceService.getBalance(start, end);
}
}
