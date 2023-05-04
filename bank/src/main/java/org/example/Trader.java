package org.example;

public class Trader {
    private String name;
    private Account account;

    public Trader(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public double addTrade(Trade trade){
        account.setTotalValueOfTrades(trade.getPrice() * trade.getQuantity());
        return account.getTotalValueOfTrades();
    }
}
