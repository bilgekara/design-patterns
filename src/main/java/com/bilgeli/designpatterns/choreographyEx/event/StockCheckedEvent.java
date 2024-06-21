package com.bilgeli.designpatterns.choreographyEx.event;

import com.bilgeli.designpatterns.choreographyEx.service.DeliveryService;

public class StockCheckedEvent implements Event{
    @Override
    public void process() {
        System.out.println("Stok kontrolü tamamlandı. Teslimat ayarlanıyor.");
        new DeliveryService().arrangeDelivery();
    }
}
