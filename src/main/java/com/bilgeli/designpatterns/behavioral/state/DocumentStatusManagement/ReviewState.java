package com.bilgeli.designpatterns.behavioral.state.DocumentStatusManagement;

public class ReviewState implements State{
    @Override
    public void publish(DocumentContext documentContext){
        System.out.println("Belge onaylandı.");
        documentContext.setState(new ApprovedState());
    }
}
