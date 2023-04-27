package org.example;

public class Gold extends MembershipType{

    private static int maxTrades = 20;

    public static int getMaxTrades() {
        return maxTrades;
    }

    public boolean canTrade(int dailyTradeNumber){
        return dailyTradeNumber < maxTrades;
    }

    @Override
    public String toString() {
        return "Gold";
    }
}
