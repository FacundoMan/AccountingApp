package com.accounting.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accounting.application.model.Earning;
import com.accounting.application.repository.EarningRepository;
@Service
public class EarningService {

    @Autowired
    private EarningRepository earningRepository;

    public Earning save(Earning earning) {
        return earningRepository.save(earning);
    }

    public List<Earning> findAll() {
        return earningRepository.findAll();
    }
}
