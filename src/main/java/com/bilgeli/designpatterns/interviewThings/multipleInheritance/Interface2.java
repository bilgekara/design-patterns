package com.bilgeli.designpatterns.interviewThings.multipleInheritance;

public interface Interface2 extends ParentInterface {
    void method();
    //Boolean differentReturnType(); -> implement classının kafası karısıyor -> hangi return type uygulucam

    void interface2();

    default void interfaceDefault(){
        System.out.println("inside interface2 Default");
    }
}
