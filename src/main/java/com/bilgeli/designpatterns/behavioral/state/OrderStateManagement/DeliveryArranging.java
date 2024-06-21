package com.bilgeli.designpatterns.behavioral.state.OrderStateManagement;

public class DeliveryArranging implements OrderState {
    @Override
    public void next(OrderContext context) {
        System.out.println("Teslimat ayarlandı. Sipariş tamamlandı.");
        context.setState(new OrderCompleted());
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Teslimat ayarlaması iptal edildi.");
        context.setState(new OrderCancelled());
    }
}
