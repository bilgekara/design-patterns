package com.bilgeli.designpatterns.template.DataProcessor;

public class XMLDataProcessor extends DataProcessor{
    @Override
    void readData() {
        System.out.println("Reading data from XML file");
    }

    @Override
    void processData() {
        System.out.println("Processing data from XML file");
    }
}
