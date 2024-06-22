package com.bilgeli.designpatterns.interviewThings;

import com.bilgeli.designpatterns.interviewThings.multipleInheritance.ImplementingClass;

public class MainClass {
    static Integer nonPrimitivInteger ; static Boolean nonPrimitivBoolean ;
    static int primitivInt ; static boolean primitivBoolean ;

    public static void main(String[] args){

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
