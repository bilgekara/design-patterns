package com.bilgeli.designpatterns.choreographyEx.event;

import com.bilgeli.designpatterns.choreographyEx.service.StockService;

public class PaymentCompletedEvent implements Event{
    @Override
    public void process() {
        System.out.println("Ödeme tamamlandı. Stok kontrolü başlatılıyor.");
        new StockService().checkStock();
    }
}
