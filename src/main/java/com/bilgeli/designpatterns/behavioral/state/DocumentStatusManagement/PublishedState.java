package com.bilgeli.designpatterns.behavioral.state.DocumentStatusManagement;

public class PublishedState implements State{
    @Override
    public void publish(DocumentContext documentContext){
        System.out.println("Belge zaten yayımlandı.");
    }
}
