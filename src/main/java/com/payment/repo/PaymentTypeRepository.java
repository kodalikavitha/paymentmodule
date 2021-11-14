package com.payment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payment.model.PaymentType;

public interface PaymentTypeRepository extends JpaRepository<PaymentType, String> {

}
