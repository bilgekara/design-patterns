package com.bilgeli.designpatterns.interviewThings.multipleInheritance;

public interface Interface1 {
    void method();
    void interface1();
    default void interfaceDefault(){
        System.out.println("inside interface1 Default");
    }
}
