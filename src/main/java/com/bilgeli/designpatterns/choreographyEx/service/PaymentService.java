package com.bilgeli.designpatterns.choreographyEx.service;

import com.bilgeli.designpatterns.choreographyEx.event.PaymentCompletedEvent;

public class PaymentService {
    public void processPayment() {
        // Ödeme işleme kodu burada
        new PaymentCompletedEvent().process();
    }
}
