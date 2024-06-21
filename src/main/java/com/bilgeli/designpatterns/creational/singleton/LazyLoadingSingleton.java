package com.bilgeli.designpatterns.creational.singleton;

public class LazyLoadingSingleton {
    private static LazyLoadingSingleton singleton ;

    private LazyLoadingSingleton() {
    }

    public static LazyLoadingSingleton getSingleton() {
        if(singleton==null)
            singleton = new LazyLoadingSingleton();

        return singleton;
    }
}
