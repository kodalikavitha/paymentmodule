package com.payment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "APP", name = "PAYMENT_TYPE")
public class PaymentType {

@Id
@Column(name = "CARD_NUMBER")
private String cardNumber;

@Column(name = "EXPIRY_DATE")
private String expiryDate;

@Column(name = "CVV")
private String cvv;

@Column(name = "CASH_ON_DELIVERY")
private String cod;

public String getCard_Number() {			//for cardnumber
    return cardNumber;
}

public void setCard_Number(String cardNumber) {
    this.cardNumber = cardNumber;
}

public String getExpiry_Date() {				// for expiry date
    return expiryDate;
}

public void setExpiry_Date(String expiryDate) {
    this.expiryDate = expiryDate;
}

public String getCVV() {				// cvv
    return cvv;
}

public void setCvv(String cvv) {
    this.cvv = cvv;
}

public String getCash_on_delivery() {				// for cash on delivery
    return cod;
}

public void setCash_on_delivery(String cod) {
    this.cod = cod;
}
}