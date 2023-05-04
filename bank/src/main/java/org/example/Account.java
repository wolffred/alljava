package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Account {

    private Trade[] arrayOfTrades = new Trade[20];
    private int length= 0;

    private List<Trade> listOfTrades = new ArrayList<>();

    private double totalValueOfTrades;

    public double getTotalValueOfTrades() {
        return totalValueOfTrades;
    }

    public void setTotalValueOfTrades(double totalValueOfTrades) {
        this.totalValueOfTrades = totalValueOfTrades;
    }

    public void aboveTen(){
        for(int i = 0; i < length; i++){
//            if (trade.getPrice() > 10){
//                System.out.println(trade);
////
//            }
            System.out.println(arrayOfTrades[i]);
        }
    }

    public Trade[] getArrayOfTrades() {
        return arrayOfTrades;
    }

    public void setArrayOfTrades(Trade trade) {
        if(length == 20){
            throw new RuntimeException();
        }
        this.arrayOfTrades[length] = trade;
        length++;
    }

    public void addNewTrade(Trade trade) throws TradeIDException {
        if(listOfTrades.contains(trade)){
            throw new TradeIDException("dup");
        }
        listOfTrades.add(trade);
    }
}
