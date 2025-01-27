package com.bilgeli.designpatterns.behavioral.strategy.PaymentStrategy.dto;

import org.springframework.stereotype.Component;

@Component
public class CreditCardInformation {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;
}
