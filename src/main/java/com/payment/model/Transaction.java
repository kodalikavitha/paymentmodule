package com.payment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "APP", name = "TRANSACTIONS")
public class Transaction {

@Id
@Column(name = "TRANSACTION_ID")
private String transactionId;

@Column(name = "STATUS")
private String status;

public String getTransactionId() {
	return transactionId;
}

public void setTransactionId(String transactionId) {
	this.transactionId = transactionId;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}
}

