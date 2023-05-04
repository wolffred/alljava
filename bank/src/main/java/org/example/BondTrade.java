package org.example;

public class BondTrade extends Trade{

    private double dividend;
    public BondTrade(String ID, String symbol, int quantity, double price, double dividend) throws TradeIDException {
        super(ID, symbol, quantity, price);
        this.dividend = dividend;
    }

    public BondTrade(String ID, String symbol, int quantity, double dividend) {
        super(ID, symbol, quantity);
        this.dividend = dividend;
    }

    @Override
    public double calcDividend() {
        return this.dividend;
    }
}
