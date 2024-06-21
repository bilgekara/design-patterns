package com.bilgeli.designpatterns.choreographyEx.service;

import com.bilgeli.designpatterns.choreographyEx.event.DeliveryArrangedEvent;

public class DeliveryService {
    public void arrangeDelivery() {
        // Teslimat ayarlama kodu burada
        new DeliveryArrangedEvent().process();
    }
}
