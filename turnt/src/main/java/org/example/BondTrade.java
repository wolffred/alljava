package org.example;

public class BondTrade extends Trade{


    public BondTrade(String ID, String symbol, int quantity, double price, double dividend) {
        super(ID, symbol, quantity, price, dividend);
    }

    public BondTrade(String ID, String symbol, int quantity, double dividend) {
        super(ID, symbol, quantity, dividend);
    }

    @Override
    public double calcDividend() {
        return this.getDividend();
    }
}
