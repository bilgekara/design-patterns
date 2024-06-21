package com.bilgeli.designpatterns.behavioral.strategy.PaymentStrategy;

public interface PaymentStrategy<T> {
    void pay(T data, double miktar);
    boolean strategyType(String type);
}
