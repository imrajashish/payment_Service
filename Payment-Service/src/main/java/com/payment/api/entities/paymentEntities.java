package com.payment.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "payment_service")
public class paymentEntities {
    @Id
    private String paymentId;
    private double payment_amount;
    private  double policy_number;

    public paymentEntities(String paymentId, double payment_amount, double policy_number) {

        this.paymentId = paymentId;
        this.payment_amount = payment_amount;
        this.policy_number = policy_number;
    }

    public paymentEntities() {
    }

    public String getPayment_id() {
        return paymentId;
    }

    public void setPayment_id(double payment_id) {
        this.paymentId = paymentId;
    }

    public double getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(double payment_amount) {
        this.payment_amount = payment_amount;
    }

    public double getPolicy_number() {
        return policy_number;
    }

    public void setPolicy_number(double policy_number) {
        this.policy_number = policy_number;
    }
}
