package com.cts.bank.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.bank.model.Transaction;
import com.cts.bank.service.Transactionservice;


@CrossOrigin
@RestController
@RequestMapping("/transaction")

public class Transactioncontroller {
	@Autowired
    private Transactionservice customerService;
    @GetMapping("/getAll")
    public List<Transaction> tranlist(){
        return customerService.getAllTrans();
    }
    
    @PostMapping("/getAllbyid")
    public List<Transaction> mylist(@RequestBody Transaction admin){
        return customerService.getAllTransdata(admin);
    }
    
    @PostMapping("/add")  
    private int savetrans(@RequestBody Transaction admin)   
    {  
    customerService.saveOrUpdate(admin);  
    return admin.getTid();  
    }
}
