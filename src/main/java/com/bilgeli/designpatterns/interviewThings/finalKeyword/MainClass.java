package com.bilgeli.designpatterns.interviewThings.finalKeyword;

public class MainClass {
    final int VALUE = 5;
    final String deger;

    public MainClass(String deger) {
        this.deger = deger;
    }

    public void main(String[] args) throws Throwable {
        try {
            System.out.println("Inside try");
            if(true){
                System.exit(0);
            }
        }finally {
            System.out.println("Inside finally");
            super.finalize();
        }

    }
}
