package com.bilgeli.designpatterns.state.OrderStateManagement;

public class OrderCompleted implements OrderState {
    @Override
    public void next(OrderContext context) {
        System.out.println("Sipariş tamamlandı. Daha fazla işlem yapılamaz.");
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Tamamlanan sipariş iptal edilemez.");
    }
}
