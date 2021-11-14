package com.payment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "APP", name = "PAYMENT")
public class Payment {

@Id
@Column(name = "PAYMENT_ID")
private String paymentId;

@Column(name = "USER_ID")
private String userId;

@Column(name = "PRODUCT_NAME")
private String productName;

@Column(name = "AMOUNT")
private String amount;

public String getPayment_Id() {			//for PaymentID
    return paymentId;
}

public void setPayment_Id(String paymentId) {
    this.paymentId = paymentId;
}

public String getUser_Id() {				// for userid
    return userId;
}

public void setUser_Id(String userId) {
    this.userId = userId;
}

public String getProduct_Name() {				// for productname
    return productName;
}

public void setProduct_Name(String productName) {
    this.productName = productName;
}

public String getAmount() {				// for amount
    return amount;
}

public void setAmount(String amount) {
    this.amount = amount;
}
}