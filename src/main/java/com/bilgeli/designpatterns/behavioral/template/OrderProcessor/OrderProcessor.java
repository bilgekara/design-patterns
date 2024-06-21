package com.bilgeli.designpatterns.behavioral.template.OrderProcessor;

import com.bilgeli.designpatterns.behavioral.strategy.PaymentStrategy.PaymentStrategyFactory;
import com.bilgeli.designpatterns.behavioral.strategy.PaymentStrategy.PaymentType;

public abstract class OrderProcessor {
    PaymentStrategyFactory paymentStrategyFactory;
    public final void processOrder(PaymentType paymentType, double amount){
        validateOrder();
        processPayment(paymentType, amount);
        completeOrder();
        generateReceipt();
    }



    abstract void validateOrder() ;

    /*private void processPayment(PaymentType paymentType, double amount) {
        paymentStrategyFactory.getStrategy(paymentType).pay(amount);
    }*/
    private void processPayment(PaymentType paymentType, double amount) {
        // pay transactions
    }
    abstract void completeOrder() ;

    private void generateReceipt() {
        System.out.println("Generating receipt for the order");
    }
}
