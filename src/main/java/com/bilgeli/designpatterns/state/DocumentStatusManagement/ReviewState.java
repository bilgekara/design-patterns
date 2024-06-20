package com.bilgeli.designpatterns.state.DocumentStatusManagement;

public class ReviewState implements State{
    @Override
    public void publish(DocumentContext documentContext){
        System.out.println("Belge onaylandı.");
        documentContext.setState(new ApprovedState());
    }
}
