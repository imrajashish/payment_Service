package com.payment.api.service;
import com.payment.api.entities.paymentEntities;

import java.util.List;

public interface PaymentService {
    public String createPaymentService(paymentEntities paymententities);

    public  String updatePaymentService(paymentEntities paymententities);
    public  String deletePaymentService(String paymententitiesId);
    public  paymentEntities getPaymentService(String paymententitiesId);

    public List<paymentEntities> getAllpayments();

}
