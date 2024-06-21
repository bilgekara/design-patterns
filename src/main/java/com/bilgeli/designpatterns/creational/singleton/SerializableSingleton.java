package com.bilgeli.designpatterns.creational.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final SerializableSingleton INSTANCE = new SerializableSingleton();

    private SerializableSingleton() {
    }

    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }



}
