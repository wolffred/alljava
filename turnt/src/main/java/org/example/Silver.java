package org.example;

public class Silver extends MembershipType{

    private static int maxTrades = 10;

    public static int getMaxTrades() {
        return maxTrades;
    }

    public boolean canTrade(int dailyTradeNumber){
        return dailyTradeNumber < maxTrades;
    }

    @Override
    public String toString() {
        return "Silver";
    }
}
