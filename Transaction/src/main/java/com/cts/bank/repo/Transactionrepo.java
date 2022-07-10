package com.cts.bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.bank.model.Transaction;

public interface Transactionrepo  extends JpaRepository<Transaction,Integer> {

}
