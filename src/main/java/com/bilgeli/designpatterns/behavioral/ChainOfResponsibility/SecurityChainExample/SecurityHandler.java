package com.bilgeli.designpatterns.behavioral.ChainOfResponsibility.SecurityChainExample;

public abstract class SecurityHandler {
    protected SecurityHandler next;

    public void setNextHandler(SecurityHandler next) {
        this.next = next;
    }

    public abstract void handleRequest(UserRequest request);
}
