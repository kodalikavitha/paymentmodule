package com.payment.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.model.Payment;
import com.payment.model.PaymentType;
import com.payment.service.PaymentService;

@RestController
public class PaymentController {

@Autowired
PaymentService paymentservice;

@RequestMapping ({ "/", "/payment" })
public List<Payment> getPayment() {
return paymentservice.getPaymentData();

}
}