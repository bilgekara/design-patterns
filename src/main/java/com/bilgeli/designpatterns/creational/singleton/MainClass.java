package com.bilgeli.designpatterns.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainClass {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        BasicSingleton singleton = BasicSingleton.getSingleton();
        LazyLoadingSingleton singleton1 = LazyLoadingSingleton.getSingleton();
        DoubleCheckedLockingSingleton singleton2 = DoubleCheckedLockingSingleton.getSingleton();
        SerializableSingleton serializableInstance = SerializableSingleton.getInstance();

        EnumSingleton instance = EnumSingleton.INSTANCE;
        System.out.println(instance.getValue());
        instance.setValue(2);
        System.out.println(instance.getValue());

        // thread-safe : enum jvm tarafından thread-safe yönetilir
        // reflection koruması sağlar
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = null;

        Constructor[] constructors = EnumSingleton.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            //instance2 = (EnumSingleton) constructor.newInstance();
            break;
        }

        System.out.println(instance1.hashCode());
        //System.out.println(instance2.hashCode());

        /* Serialization :
           Bir Singleton sınıfı, Serializable arayüzünü uyguluyorsa,
           bu sınıfın bir örneği serialize edilip tekrar deserialize edildiğinde yeni bir örnek oluşturulabilir.
           ---
           Enum türleri JVM tarafından özel olarak yönetilir ve
           enum sabitlerinin serialization ve deserialization işlemleri sırasında aynı örnek olarak korunması garanti edilir.
         */

        // Serialize to a file
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(serializableInstance);
        out.close();

        // Deserialize from a file
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SerializableSingleton serializableInstance2 = (SerializableSingleton) in.readObject();
        in.close();

        System.out.println("Instance 1 hash: " + instance1.hashCode());
        System.out.println("Instance 2 hash: " + instance2.hashCode());
    }
}
