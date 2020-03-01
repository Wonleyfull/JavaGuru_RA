package com.javaguru.lessons.lesson4.homework;

public class StockTest {
//    public static void main(String[] args) {
//        StockTest testTrigger = new StockTest();
//        testTrigger.googleExampleTest();
//        testTrigger.appleExampleTest();
//    }

    public String googleExampleTest() {
        Stock googleStock = new Stock("GOOG", 10);
        googleStock.updatePrice(6);
        googleStock.updatePrice(12);
        googleStock.updatePrice(20);
        String googleCheck = googleStock.getInformation();
        if (googleCheck.equals("Company: GOOG Current price: 12.00 Minimum price: 6.00 Maximum price: 20.00")) {
            return "googleExampleTest passed";
        } else {
            System.out.println("googleExampleTest failed.");
            return "googleExampleTest failed";
        }
    }

    public String appleExampleTest() {
        Stock appleStock = new Stock("APPL", 66);
        appleStock.updatePrice(11);
        appleStock.updatePrice(70);
        appleStock.updatePrice(30);
        String appleCheck = appleStock.getInformation();
        if (appleCheck.equals("Company: APPL Current price: 30.00 Minimum price: 11 Maximum price: 70.00")) {
            return "appleExampleTest passed";
        } else {
            System.out.println("appleExampleTest failed.");
            return "appleExampleTest failed";
        }
    }
    public String stockTestResult() {
        if (googleExampleTest().equals("googleExampleTest failed") || appleExampleTest().equals("appleExampleTest failed")) {
            return "Tests failed";
        } else {return "Tests passed";}
    }
}
