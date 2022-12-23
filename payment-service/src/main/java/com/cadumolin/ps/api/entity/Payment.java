package com.cadumolin.ps.api.entity;

/*
 * author: Carlos Eduardo Dal Molin
 * date: 22/12/2022
 */

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PAYMENT_TB")
public class Payment {

    @Id
    @GeneratedValue
    private Integer paymentId;
    private String paymentStatus;
    private String transationId;
}
