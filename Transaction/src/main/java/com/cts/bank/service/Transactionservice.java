package com.cts.bank.service;

import java.util.List;

import com.cts.bank.model.Transaction;



public interface Transactionservice {
	public List<Transaction> getAllTrans();
	 public void saveOrUpdate(Transaction trans);
	 public List<Transaction> getAllTransdata(Transaction student);
}
