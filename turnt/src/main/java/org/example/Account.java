package org.example;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private double totalValue;
    private List<Trade> trades = new ArrayList<>();


    public Account(double totalValue) {
        this.totalValue = totalValue;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public void addTrade(Trade trade){
        trades.add(trade);
    }

    public void loop(){
        for (Trade e: trades){
            System.out.println(e);
        }

    }

    public void loop(int max){
        for (Trade e: trades){
            if(e.getPrice() < max) {
                System.out.println(e);
            }
        }

    }
}
