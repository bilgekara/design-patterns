package com.bilgeli.designpatterns.behavioral.strategy.PaymentStrategy.dto;

import lombok.Builder;
@Builder
public class PaypalInformaiton {
    private String email;
    private String passw;
}
