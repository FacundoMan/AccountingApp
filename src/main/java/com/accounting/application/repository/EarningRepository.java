package com.accounting.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accounting.application.model.Earning;

public interface EarningRepository extends JpaRepository<Earning, Long> {

}
