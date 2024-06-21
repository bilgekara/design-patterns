package com.bilgeli.designpatterns.creational.singleton;

public class BasicSingleton {
    private static BasicSingleton singleton = new BasicSingleton();

    private BasicSingleton() {
    }

    public static BasicSingleton getSingleton() {
        return singleton;
    }
}
