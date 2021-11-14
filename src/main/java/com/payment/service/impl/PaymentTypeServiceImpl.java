package com.payment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.model.PaymentType;
import com.payment.repo.PaymentTypeRepository;
import com.payment.service.PaymentTypeService;

@Service
public class PaymentTypeServiceImpl
implements PaymentTypeService {

@Autowired
PaymentTypeRepository paymentTypeRepo;

@Override
public List<PaymentType> getPaymentTypeData() {
return paymentTypeRepo.findAll();
}
}