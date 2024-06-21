package com.bilgeli.designpatterns.choreographyEx.service;

import com.bilgeli.designpatterns.choreographyEx.event.StockCheckedEvent;

public class StockService {
    public void checkStock() {
        // Stok kontrol kodu burada
        new StockCheckedEvent().process();
    }
}
