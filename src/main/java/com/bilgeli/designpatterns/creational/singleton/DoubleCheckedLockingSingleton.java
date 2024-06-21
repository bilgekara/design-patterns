package com.bilgeli.designpatterns.creational.singleton;

public class DoubleCheckedLockingSingleton {
    private static DoubleCheckedLockingSingleton singleton;

    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getSingleton() {

        if (singleton == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (singleton == null)
                    singleton = new DoubleCheckedLockingSingleton();
            }
        }

        return singleton;
    }
}
