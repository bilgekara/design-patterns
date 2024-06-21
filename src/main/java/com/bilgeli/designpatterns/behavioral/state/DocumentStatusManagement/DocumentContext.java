package com.bilgeli.designpatterns.behavioral.state.DocumentStatusManagement;

public class DocumentContext {
    private State state;

    public DocumentContext() {
        this.state = new DraftState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void publish() {
        state.publish(this);
    }

}
