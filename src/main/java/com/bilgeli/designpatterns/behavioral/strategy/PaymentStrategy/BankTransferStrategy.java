package com.bilgeli.designpatterns.behavioral.strategy.PaymentStrategy;

import com.bilgeli.designpatterns.behavioral.strategy.PaymentStrategy.dto.BankTransferInformation;
import org.springframework.stereotype.Component;

@Component
public class BankTransferStrategy implements PaymentStrategy<BankTransferInformation>{
    @Override
    public void pay(BankTransferInformation bankTransfer, double miktar){
        System.out.println(miktar + " TL banka havalesi ile ödendi.");
        // Banka havalesi ile ödeme işlemleri
    }

    @Override
    public boolean strategyType(String type){
        return PaymentType.valueOf(type) == PaymentType.BankTransfer;
    }
}
