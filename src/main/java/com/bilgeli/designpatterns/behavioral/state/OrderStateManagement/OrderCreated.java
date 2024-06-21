package com.bilgeli.designpatterns.behavioral.state.OrderStateManagement;

public class OrderCreated implements OrderState {
    @Override
    public void next(OrderContext context) {
        System.out.println("Sipariş oluşturuldu. Ödeme işlemi başlatılıyor.");
        context.setState(new PaymentProcessing());
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Sipariş iptal edildi.");
        context.setState(new OrderCancelled());
    }
}
