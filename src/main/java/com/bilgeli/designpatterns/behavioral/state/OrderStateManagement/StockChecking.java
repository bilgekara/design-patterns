package com.bilgeli.designpatterns.behavioral.state.OrderStateManagement;

public class StockChecking implements OrderState {
    @Override
    public void next(OrderContext context) {
        System.out.println("Stok kontrolü tamamlandı. Teslimat ayarlanıyor.");
        context.setState(new DeliveryArranging());
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Stok kontrolü iptal edildi.");
        context.setState(new OrderCancelled());
    }
}
