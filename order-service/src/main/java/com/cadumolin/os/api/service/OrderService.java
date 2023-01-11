package com.cadumolin.os.api.service;

/*
 * author: Carlos Eduardo Dal Molin
 * date: 20/12/2022
 */

import com.cadumolin.os.api.common.Payment;
import com.cadumolin.os.api.common.TransactionRequest;
import com.cadumolin.os.api.common.TransactionResponse;
import com.cadumolin.os.api.entity.Order;
import com.cadumolin.os.api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RefreshScope
public class OrderService {

    @Autowired
    private RestTemplate template;

    @Autowired
    @Lazy
    private OrderRepository repository;

    @Value("${microservice.payment-service.endpoints.endpoint.uri}")
    private String ENDPOINT_URL;

    public TransactionResponse saveOrder(TransactionRequest request) {
        String response;
        Order order = request.getOrder();
        Payment payment = request.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());

        Payment paymentResponse = template.postForObject("http://PAYMENT-SERVICE/payment/doPayment", payment, Payment.class);

        response = paymentResponse.getPaymentStatus().equals("success")?"payment processing successfull and order placed":"there is a failure in payment api, order added to cart";

        repository.save(order);

        return new TransactionResponse(order, paymentResponse.getAmount(), paymentResponse.getTransationId(), response);
    }
}
