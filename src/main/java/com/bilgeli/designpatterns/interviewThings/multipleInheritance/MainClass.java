package com.bilgeli.designpatterns.interviewThings.multipleInheritance;

public class MainClass {
    public static void main(String[] args){
        ImplementingClass ce= new ImplementingClass();
        ce.method();
        ce.interfaceDefault();

        Interface1.interfaceStatic();
        int value = Interface1.VALUE;

        // this is inside interface 2
        ce.parentMethod();
    }
}
