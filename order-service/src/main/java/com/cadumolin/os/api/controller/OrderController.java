package com.cadumolin.os.api.controller;

/*
 * author: Carlos Eduardo Dal Molin
 * date: 20/12/2022
 */

import com.cadumolin.os.api.common.TransactionRequest;
import com.cadumolin.os.api.common.TransactionResponse;
import com.cadumolin.os.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/orders")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {
        return null;
    }
}
