package com.bilgeli.designpatterns.choreographyEx;

import com.bilgeli.designpatterns.choreographyEx.event.OrderCreatedEvent;

public class MainClass {
    public static void main(String[] args) {
        // Sipariş oluşturma işlemi başlatılıyor
        new OrderCreatedEvent().process();
    }
}
