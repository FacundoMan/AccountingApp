package com.accounting.application.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accounting.application.model.Earning;

public interface EarningRepository extends JpaRepository<Earning, Long> {

    List<Earning> findByDateBetween(LocalDate start, LocalDate end);
}
