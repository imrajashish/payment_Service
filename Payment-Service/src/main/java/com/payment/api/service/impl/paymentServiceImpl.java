package com.payment.api.service.impl;

import com.payment.api.entities.paymentEntities;
import com.payment.api.repository.PaymentRepository;
import com.payment.api.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class paymentServiceImpl implements PaymentService {

    public paymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    PaymentRepository  paymentRepository;
    @Override
    public String createPaymentService(paymentEntities paymententities) {
        paymentRepository.save(paymententities);
        return "Successfully";
    }

    @Override
    public String updatePaymentService(paymentEntities paymententities) {
        paymentRepository.save(paymententities);
        return "Successfully";
    }

    @Override
    public String deletePaymentService(String paymententitiesId) {
        paymentRepository.deleteById(paymententitiesId);
        return "Successfully Deleted";
    }

    @Override
    public paymentEntities getPaymentService(String paymententitiesId) {

        return paymentRepository.findById(paymententitiesId).get();
    }

    @Override
    public List<paymentEntities> getAllpayments() {
        return paymentRepository.findAll();
    }
}
