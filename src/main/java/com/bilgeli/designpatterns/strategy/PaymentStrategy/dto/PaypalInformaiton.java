package com.bilgeli.designpatterns.strategy.PaymentStrategy.dto;

import lombok.Builder;
@Builder
public class PaypalInformaiton {
    private String email;
    private String passw;
}
