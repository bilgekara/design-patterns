package com.bilgeli.designpatterns.strategy.PaymentStrategy.dto;

import org.springframework.stereotype.Component;

@Component
public class BankTransferInformation {
    private String bankName;
    private String accountNum;
}
