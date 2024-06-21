package com.bilgeli.designpatterns.template.DataProcessor;

public abstract class DataProcessor {

    // final : bu metot override edilemez -> algoritmanın iskeletini belirler
    public final void process(){
        readData();
        processData();
        writeData();
    }

    abstract void readData() ;
    abstract void processData() ;


    void writeData() {
        System.out.println("Writing data to the target system");
    }
}
