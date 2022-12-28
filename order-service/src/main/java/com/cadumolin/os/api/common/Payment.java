package com.cadumolin.os.api.common;

/*
 * author: Carlos Eduardo Dal Molin
 * date: 22/12/2022
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private Integer paymentId;
    private String paymentStatus;
    private String transationId;
    private Integer orderId;
    private Double amount;
}
