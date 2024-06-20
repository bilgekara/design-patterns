package com.bilgeli.designpatterns.state.OrderStateManagement;

public class OrderContext {
    private OrderState state;

    public OrderContext() {
        this.state = new OrderCreated();  // Başlangıç durumu
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void next() {
        state.next(this);
    }

    public void cancel() {
        state.cancel(this);
    }
}
