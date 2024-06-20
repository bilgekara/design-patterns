package com.bilgeli.designpatterns.strategy.PaymentStrategy;

public interface PaymentStrategy<T> {
    void pay(T data, double miktar);
    boolean strategyType(String type);
}
