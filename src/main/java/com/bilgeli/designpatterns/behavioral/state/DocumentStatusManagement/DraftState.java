package com.bilgeli.designpatterns.behavioral.state.DocumentStatusManagement;

public class DraftState implements State {
    @Override
    public void publish(DocumentContext documentContext){
        System.out.println("Belge incelenmeye gönderildi.");
        documentContext.setState(new ReviewState());
    }
}
