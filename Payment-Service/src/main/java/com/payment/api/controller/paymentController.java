package com.payment.api.controller;

import com.payment.api.entities.paymentEntities;
import com.payment.api.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class paymentController {
    PaymentService paymentService;
    public paymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }


    @GetMapping("{paymentId}")
    public  paymentEntities getPaymentDetails(@PathVariable("paymentId") String paymentId){
        return paymentService.getPaymentService(paymentId);

    }

    @GetMapping()
    public List<paymentEntities> getPaymentDetails(){
        return paymentService.getAllpayments();

    }
    @PostMapping
    public String createPaymentDetails(@RequestBody paymentEntities paymententities) {
        paymentService.createPaymentService(paymententities);
        return "Payment is Successfully";

    }

    @PutMapping
    public String updatePaymentDetails(@RequestBody paymentEntities paymententities) {
       paymentService.updatePaymentService(paymententities);
        return "Payment is Successfully";

    }
    @DeleteMapping("{paymentId}")
    public String deletePaymentDetails (@PathVariable("paymentId") String paymentId) {
       paymentService.deletePaymentService(paymentId);
        return "Payment is Deleted Successfully";

    }

}
