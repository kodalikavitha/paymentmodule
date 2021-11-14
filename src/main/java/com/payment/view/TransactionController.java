package com.payment.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.model.Transaction;
import com.payment.service.TransactionService;

@RestController
public class TransactionController {

@Autowired
TransactionService transactionservice;

@RequestMapping ({ "/", "/transaction" })
public List<Transaction> getTransaction() {
return transactionservice.getTransactionData();

}
}