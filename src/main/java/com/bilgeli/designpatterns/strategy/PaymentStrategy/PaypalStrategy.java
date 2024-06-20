package com.bilgeli.designpatterns.strategy.PaymentStrategy;

import com.bilgeli.designpatterns.strategy.PaymentStrategy.dto.PaypalInformaiton;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class PaypalStrategy implements PaymentStrategy<PaypalInformaiton>{
    @Override
    public void pay(PaypalInformaiton paypalInformaiton, double miktar){
        System.out.println(miktar + " TL PayPal ile ödendi.");
        // PayPal ile ödeme işlemleri
    }

    @Override
    public boolean strategyType(String type){
        return PaymentType.valueOf(type) == PaymentType.PayPal;
    }
}
