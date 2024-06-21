package com.bilgeli.designpatterns.behavioral.state.OrderStateManagement;

public class OrderCancelled implements OrderState {
    @Override
    public void next(OrderContext context) {
        System.out.println("Sipariş iptal edildi. Daha fazla işlem yapılamaz.");
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Sipariş zaten iptal edildi.");
    }
}
