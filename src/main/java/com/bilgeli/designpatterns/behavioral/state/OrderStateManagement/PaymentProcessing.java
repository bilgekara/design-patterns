package com.bilgeli.designpatterns.behavioral.state.OrderStateManagement;

public class PaymentProcessing implements OrderState {
    @Override
    public void next(OrderContext context) {
        System.out.println("Ödeme başarılı. Stok kontrolü başlatılıyor.");
        context.setState(new StockChecking());
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Ödeme işlemi iptal edildi.");
        context.setState(new OrderCancelled());
    }
}
