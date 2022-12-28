package com.cadumolin.ps.api.service;

import com.cadumolin.ps.api.entity.Payment;
import com.cadumolin.ps.api.repository.PaymentRepository;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

/*
 * author: Carlos Eduardo Dal Molin
 * date: 22/12/2022
 */

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public Payment doPayment(Payment payment) {
        payment.setPaymentStatus(paymentProcessing());
        payment.setTransationId(UUID.randomUUID().toString());
        return repository.save(payment);
    }

    public String paymentProcessing() {
        return new Random().nextBoolean()?"success":"false";
    }
}
