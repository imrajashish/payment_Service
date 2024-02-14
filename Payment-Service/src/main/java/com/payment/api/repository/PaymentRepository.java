package com.payment.api.repository;

import com.payment.api.entities.paymentEntities;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository <paymentEntities , String > {

}
