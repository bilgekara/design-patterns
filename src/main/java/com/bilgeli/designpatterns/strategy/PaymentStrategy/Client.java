package com.bilgeli.designpatterns.strategy.PaymentStrategy;

import com.bilgeli.designpatterns.strategy.PaymentStrategy.dto.PaypalInformaiton;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Client {
    private final PaymentStrategyFactory paymentStrategyFactory ;
    private final PaymentContext paymentContext;
    private final double amount = 23.4;

    public void sendPaymentWithFactory(){
        PaypalInformaiton paypalInformaiton = PaypalInformaiton.builder()
                .email("karabilge@gmail.com")
                .passw("123")
                .build();

        PaymentStrategy strategy = paymentStrategyFactory.getStrategy(PaymentType.PayPal);

        strategy.pay(paypalInformaiton, amount);
    }
    public void sendPaymentWithContext(){
        PaypalInformaiton paypalInformaiton = PaypalInformaiton.builder()
                .email("karabilge@gmail.com")
                .passw("123")
                .build();

        paymentContext.setPaymentStrategy(new PaypalStrategy());

        paymentContext.pay(paypalInformaiton, amount);

    }
}
