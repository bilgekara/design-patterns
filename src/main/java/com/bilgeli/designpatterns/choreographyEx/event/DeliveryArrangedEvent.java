package com.bilgeli.designpatterns.choreographyEx.event;

public class DeliveryArrangedEvent implements Event{
    @Override
    public void process() {
        System.out.println("Teslimat ayarlandı. Sipariş tamamlandı.");
    }
}
