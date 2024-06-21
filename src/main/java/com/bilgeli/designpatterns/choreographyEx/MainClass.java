package com.bilgeli.designpatterns.choreographyEx;

import com.bilgeli.designpatterns.choreographyEx.event.OrderCreatedEvent;
import com.bilgeli.designpatterns.state.DocumentStatusManagement.DocumentContext;

public class MainClass {
    public static void main(String[] args) {
        // Sipariş oluşturma işlemi başlatılıyor
        new OrderCreatedEvent().process();
    }
}
