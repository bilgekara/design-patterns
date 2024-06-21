package com.bilgeli.designpatterns.behavioral.strategy.PaymentStrategy;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PaymentStrategyFactory {
    private final List<PaymentStrategy<?>> paymentStrategies;

    public PaymentStrategyFactory(List<PaymentStrategy<?>> paymentStrategies) {
        this.paymentStrategies = paymentStrategies;
    }

    public PaymentStrategy getStrategy(PaymentType paymentType){
        return paymentStrategies.stream().
                filter(each->each.strategyType(paymentType.name()))
                .findAny()
                .orElseThrow(RuntimeException::new);

    }
}
