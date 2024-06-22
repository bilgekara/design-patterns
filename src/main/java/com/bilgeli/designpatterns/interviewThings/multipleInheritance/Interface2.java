package com.bilgeli.designpatterns.interviewThings.multipleInheritance;

public interface Interface2 {
    void method();
    void interface2();

    default void interfaceDefault(){
        System.out.println("inside interface2 Default");
    }
}
