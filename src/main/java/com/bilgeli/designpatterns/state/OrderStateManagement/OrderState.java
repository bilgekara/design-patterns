package com.bilgeli.designpatterns.state.OrderStateManagement;

public interface OrderState {
    void next(OrderContext context);
    void cancel(OrderContext context);
}
