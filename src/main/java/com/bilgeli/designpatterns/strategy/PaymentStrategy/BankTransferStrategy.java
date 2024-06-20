package com.bilgeli.designpatterns.strategy.PaymentStrategy;

import com.bilgeli.designpatterns.strategy.PaymentStrategy.dto.BankTransferInformation;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
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
