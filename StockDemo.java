package com.javaguru.lessons.lesson4.homework;

public class StockDemo {
    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);
        google.printInformation();
        google.updatePrice(6);
        google.updatePrice(12);
        google.updatePrice(20);
        google.printInformation();

    }

}
