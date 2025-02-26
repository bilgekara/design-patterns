package com.bilgeli.designpatterns.interviewThings;

import com.bilgeli.designpatterns.interviewThings.multipleInheritance.ImplementingClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    static Integer nonPrimitivInteger;
    static Boolean nonPrimitivBoolean;
    static int primitivInt;
    static boolean primitivBoolean;

    public static void main(String[] args) {
        //java always pass-by-value
        int primitiv = 5;
        Integer nonPrimitiv = 5;
        passByValue(primitiv);
        passByReference(nonPrimitiv);
        //List<Integer> deneme= new ArrayList<>();
        //listExample(deneme);
        //System.out.println(deneme);

        List<Integer> de= Arrays.asList(4,6,7,8);
        de(de);
        System.out.println(de);

        System.out.println("this is a primitiv->" + primitiv);
        System.out.println("this is a nonPrimitiv->" + nonPrimitiv);

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

    private static void de(List<Integer> de) {
        de=new ArrayList<>();
    }

    private static void listExample(List<Integer> deneme) {
        deneme.add(4);
        deneme.add(4);
        deneme.add(4);
        deneme.add(4);
    }

    private static void passByReference(Integer nonPrimitiv) {
        nonPrimitiv = 10;
    }

    private static void passByValue(int primitiv) {
        primitiv = 10;
    }
}
