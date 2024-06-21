package com.bilgeli.designpatterns.behavioral.state.DocumentStatusManagement;

public class ApprovedState implements State{
    @Override
    public void publish(DocumentContext documentContext){
        System.out.println("Belge yayımlandı.");
        documentContext.setState(new PublishedState());
    }
}
