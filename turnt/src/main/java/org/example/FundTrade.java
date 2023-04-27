package org.example;

public class FundTrade extends Trade{
    public FundTrade(String ID, String symbol, int quantity) {
        super(ID, symbol, quantity);
    }

    public FundTrade(String ID, String symbol, double price, int quantity) {
        super(ID, symbol, price, quantity);
    }


    @Override
    public double calcDividend() {
        double divi = (50.0/100.0) * this.getPrice();
        return divi;
    }
}
