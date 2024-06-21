package com.bilgeli.designpatterns.behavioral.state.OrderStateManagement;

public interface OrderState {
    void next(OrderContext context);
    void cancel(OrderContext context);
}
