package com.bilgeli.designpatterns.interviewThings.multipleInheritance;

public interface Interface1 {
    int VALUE = 0; // this is final + static
    void method();
    //String differentReturnType(); -> implement classının kafası karısıyor
    void interface1();
    default void interfaceDefault(){
        System.out.println("inside interface1 Default");
    }

    static void interfaceStatic(){
        System.out.println("inside interface1 static");
    }
}
