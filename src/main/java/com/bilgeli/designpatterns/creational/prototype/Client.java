package com.bilgeli.designpatterns.creational.prototype;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Client {
    private final Prototype prototype;

    public Prototype createClone(){
        return prototype.clone();
    }
}
