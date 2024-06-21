package com.bilgeli.designpatterns.creational.singleton;

public class MainClass {
    static Integer nonPrimitivInteger ; static Boolean nonPrimitivBoolean ;
    static int primitivInt ; static boolean primitivBoolean ;
    public static void main(String[] args) {
        BasicSingleton singleton = BasicSingleton.getSingleton();
        LazyLoadingSingleton singleton1 = LazyLoadingSingleton.getSingleton();
        DoubleCheckedLockingSingleton singleton2 = DoubleCheckedLockingSingleton.getSingleton();

        EnumSingleton instance = EnumSingleton.INSTANCE;
        System.out.println(instance.getValue());
        instance.setValue(2);
        System.out.println(instance.getValue());

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Integer: ");
        stringBuilder.append(nonPrimitivInteger);
        stringBuilder.append("\nint: ");
        stringBuilder.append(primitivInt);
        stringBuilder.append("\nBoolean: ");
        stringBuilder.append(nonPrimitivBoolean);
        stringBuilder.append("\nboolean: ");
        stringBuilder.append(primitivBoolean);

        System.out.println(stringBuilder);

    }
}
