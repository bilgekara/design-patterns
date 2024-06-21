package com.bilgeli.designpatterns.choreographyEx.event;

import com.bilgeli.designpatterns.choreographyEx.service.PaymentService;

public class OrderCreatedEvent implements Event{
    @Override
    public void process() {
        System.out.println("Sipariş oluşturuldu. Ödeme işlemi başlatılıyor.");
        new PaymentService().processPayment();
    }
}
