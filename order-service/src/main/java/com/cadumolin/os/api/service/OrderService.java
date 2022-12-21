package com.cadumolin.os.api.service;

/*
 * author: Carlos Eduardo Dal Molin
 * date: 20/12/2022
 */

import com.cadumolin.os.api.entity.Order;
import com.cadumolin.os.api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public Order saveOrder(Order order) {
        return repository.save(order);
    }
}
