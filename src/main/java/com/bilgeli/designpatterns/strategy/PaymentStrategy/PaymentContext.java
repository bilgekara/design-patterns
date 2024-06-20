package com.bilgeli.designpatterns.strategy.PaymentStrategy;

import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Component
public class PaymentContext {
    private PaymentStrategy paymentStrategy;
    public <T> void pay(T data, double miktar) {
        paymentStrategy.pay(data, miktar);
    }

}
