package com.payment.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.model.PaymentType;
import com.payment.service.PaymentTypeService;

@RestController
public class PaymentTypeController {

@Autowired
PaymentTypeService paymentTypeservice;

@RequestMapping ({ "/", "/paymentType" })
public List<PaymentType> getPaymentType() {
return paymentTypeservice.getPaymentTypeData();

}
}