package com.bilgeli.designpatterns.behavioral.ChainOfResponsibility;

public abstract class Handler {
    /* state de nesne kendisi biliyor hangi duruma gideceğini,
    chain de zinciri biz oluşturuyoruz*/
    private Handler next;

    public void setNextHandler(Handler next) {
        this.next = next;
    }

    public void handleRequest(){
        if(next!=null){
            next.handleRequest();
        }
    }
}
