package com.bilgeli.designpatterns.interviewThings.multipleInheritance;

public class ImplementingClass implements Interface1, Interface2 {
    @Override
    public void method() {
        System.out.println("inside class1");
    }

    @Override
    public void interface2() {
        System.out.println("inside interface2");
    }

    @Override
    public void interface1() {
        System.out.println("inside interface1");
    }

    @Override
    public void interfaceDefault() {
        Interface1.super.interfaceDefault();
        Interface2.super.interfaceDefault();
        //System.out.println("inside overriding interfaceDefault");

    }
}
