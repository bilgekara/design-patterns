package com.bilgeli.designpatterns.creational.prototype;

import com.bilgeli.designpatterns.creational.singleton.*;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainClass {
    public static void main(String[] args) {
        ConcretePrototype original = new ConcretePrototype();
        Client client = new Client(original);

        // Creating a new instance by cloning the prototype
        ConcretePrototype clone = (ConcretePrototype) client.createClone();
    }
}
