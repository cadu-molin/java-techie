package com.cadumolin.cloudgateway;

/*
 * author: Carlos Eduardo Dal Molin
 * date: 05/01/2023
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/orderFallBack")
    public Mono<String> orderServiceFallBack() {
        return Mono.just("Order Service is taking too long to respond or is down . Please try again later");
    }

    @RequestMapping("paymentFallback")
    public Mono<String> paymentFallBack() {
        return Mono.just("Payment Service is taking too long to respond or is down . Please try again later");
    }
}
