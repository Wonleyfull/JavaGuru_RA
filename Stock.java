package com.javaguru.lessons.lesson4.homework;

public class Stock {
    public String stockName;
    public double currentPrice;
    public double minPrice;
    public double maxPrice;

    public Stock(String stockName, double currentPrice) {
        this.stockName = stockName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }
    //setters and getters
    void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }
    void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }
    public double getCurrentPrice() {return currentPrice;}
    public double getMinPrice() {return minPrice;}
    public double getMaxPrice() {return maxPrice;}

    public void updatePrice(double value) {
        if (value > currentPrice && value > maxPrice) {
            setMaxPrice(value);
        } else if (value < currentPrice && value < minPrice) {
            setMinPrice(value);
        } else {
            setCurrentPrice(value);
        }
    }
    public String getInformation() {
        return ("Company: " + stockName +
                " Current price: " + String.format("%.2f", currentPrice) +
                " Minimum price: " + String.format("%.2f", minPrice) +
                " Maximum price: " + String.format("%.2f",maxPrice));
    }
    public void printInformation () {
        StockTest stockTestPull = new StockTest();
        if (stockTestPull.stockTestResult().equals("Tests passed")) {
            System.out.println("Company = " + stockName + ",  Current price: " + currentPrice + ", Minimum price: " + minPrice + ", Maximum price: " + maxPrice +".");
        }
        else {System.out.println("Program works not properly, please check the code");
        }
    }
}