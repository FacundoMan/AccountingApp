package com.accounting.application.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.accounting.application.model.Earning;
import com.accounting.application.service.EarningService;

@RestController
@RequestMapping("/earnings")
public class EarningController {
    @Autowired
    private EarningService earningService;

    @PostMapping
    public Earning create(@RequestBody Earning earning) {
        return earningService.save(earning);
    }

    @GetMapping
    public List<Earning> getAll() {
        return earningService.findAll();
    }
}