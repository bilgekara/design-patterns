package com.bilgeli.designpatterns.ChainOfResponsibility;

public abstract class Handler {
    private Handler next;

    public void setNextHandler(Handler next) {
        this.next = next;
    }
}
