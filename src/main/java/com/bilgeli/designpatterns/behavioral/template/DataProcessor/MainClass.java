package com.bilgeli.designpatterns.behavioral.template.DataProcessor;

public class MainClass {
    public static void main(String[] args) {
        DataProcessor csvDataProcessor = new CSVDataProcessor();
        DataProcessor jsonDataProcessor = new JsonDataProcessor();
        DataProcessor xmlDataProcessor = new XMLDataProcessor();

        System.out.println("Processing CSV data...");
        csvDataProcessor.process();

        System.out.println("Processing JSON data...");
        jsonDataProcessor.process();

        System.out.println("Processing XML data...");
        xmlDataProcessor.process();

    }
}
