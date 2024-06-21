package com.bilgeli.designpatterns.behavioral.ChainOfResponsibility;

public abstract class Handler {
    private Handler next;

    public void setNextHandler(Handler next) {
        this.next = next;
    }
}
