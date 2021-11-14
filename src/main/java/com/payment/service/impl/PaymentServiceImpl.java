package com.payment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.model.Payment;
import com.payment.model.PaymentType;
import com.payment.repo.PaymentRepository;
import com.payment.service.PaymentService;

@Service
public class PaymentServiceImpl
implements PaymentService {

@Autowired
PaymentRepository paymentRepo;

@Override
public List<Payment> getPaymentData() {
return paymentRepo.findAll();
}


}