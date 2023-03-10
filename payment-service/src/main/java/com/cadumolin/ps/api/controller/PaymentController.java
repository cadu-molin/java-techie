package com.cadumolin.ps.api.controller;

/*
 * author: Carlos Eduardo Dal Molin
 * date: 23/12/2022
 */

import com.cadumolin.ps.api.entity.Payment;
import com.cadumolin.ps.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment) {
        return service.doPayment(payment);
    }

    @GetMapping("/{orderId}")
    public Payment findPaymentHistoryByOerderId(@PathVariable Integer orderId) {
        return service.findPaymentHistoryByOerderId(orderId);
    }
}
