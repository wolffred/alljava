package org.example;

public class Trader {
    private String name;
    private Account account;


    public Trader(String name, Account account) {
        this.name = name;
        this.account = account;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double addTrade(Trade trade){
        double newTotal = (trade.getPrice() * trade.getQuantity()) + account.getTotalValue();
        account.setTotalValue(newTotal);
        return account.getTotalValue();
    }


}
