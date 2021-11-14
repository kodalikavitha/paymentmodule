package com.payment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.model.Transaction;
import com.payment.repo.TransactionRepository;
import com.payment.service.TransactionService;

@Service
public class TransactionServiceImpl
implements TransactionService {

@Autowired
TransactionRepository transactionRepo;

@Override
public List<Transaction> getTransactionData() {
return transactionRepo.findAll();
}
}