package com.cadumolin.os.api.common;

/*
 * author: Carlos Eduardo Dal Molin
 * date: 26/12/2022
 */

import com.cadumolin.os.api.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {

    private Order order;
    private Payment payment;
}
