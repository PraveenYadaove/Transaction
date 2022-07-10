package com.cts.bank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.bank.model.Transaction;
import com.cts.bank.repo.Transactionrepo;


@Service
public class Transactionimpl implements Transactionservice{
		@Autowired
	    private Transactionrepo tr;
		
		@Override
	    public void saveOrUpdate(Transaction student) {
	       tr.save(student);
	    }
		@Override
	    public List<Transaction> getAllTrans() {
	    	List<Transaction> books = new ArrayList<Transaction>();
	    	
	    	tr.findAll().forEach(books1 -> books.add(books1));
	    	
	    	return books; 
	    }
		@Override
	    public List<Transaction> getAllTransdata(Transaction student)
	    {
	    	List<Transaction> books = new ArrayList<Transaction>();  
	    	
	    	for(Transaction x:tr.findAll())
	    	{
	    		if(x.getSenderid()==student.getSenderid())
	    		{
	    			books.add(x);
	    		}
	    	}
	    	return books;
	    }
	    
}

