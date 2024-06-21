package com.bilgeli.designpatterns.behavioral.strategy.PaymentStrategy;

import com.bilgeli.designpatterns.behavioral.strategy.PaymentStrategy.dto.CreditCardInformation;
import org.springframework.stereotype.Component;

@Component
public class CreditCardStrategy implements PaymentStrategy<CreditCardInformation>{
    @Override
    public void pay(CreditCardInformation cardInformation, double miktar){
        System.out.println(miktar + " TL kredi kartı ile ödendi.");
        // Kredi kartı ile ödeme işlemleri
    }

    @Override
    public boolean strategyType(String type){
        return PaymentType.valueOf(type) == PaymentType.CreditCart;
    }
}
