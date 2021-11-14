package com.payment.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payment.model.Payment;
import com.payment.model.PaymentType;

public interface PaymentRepository extends JpaRepository<Payment, String> {

	

}
