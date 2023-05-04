package org.example;

public class FundTrade extends Trade{
    private double dividendPercentage;
    private double dividend;
    public FundTrade(String ID, String symbol, int quantity, double price, double dividendPercentage) throws TradeIDException {
        super(ID, symbol, quantity, price);
        this.dividendPercentage = dividendPercentage;
    }

    public FundTrade(String ID, String symbol, int quantity, double dividendPercentage) {
        super(ID, symbol, quantity);
        this.dividendPercentage = dividendPercentage;
    }

    public double getDividend() {
        return dividend;
    }

    public void setDividend(double dividend) {
        this.dividend = dividend;
    }

    @Override
    public double calcDividend() {
        this.setDividend(this.dividendPercentage * this.getPrice());
        return this.getDividend();
    }
}
