package com.bilgeli.designpatterns.behavioral.template.DataProcessor;

public class JsonDataProcessor extends DataProcessor{
    @Override
    void readData() {
        System.out.println("Reading data from JSON file");
    }

    @Override
    void processData() {
        System.out.println("Processing data from JSON file");
    }
}
