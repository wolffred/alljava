package org.example;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Bronze extends MembershipType{

    private static int maxTrades = 5;

    public static int getMaxTrades() {
        return maxTrades;
    }

    public boolean canTrade(int dailyTradeNumber){
        boolean can  = Boolean.parseBoolean(null);
        if(LocalTime.now().isBefore(LocalTime.of(8, 0))){
            can = false;
        }else if (dailyTradeNumber < maxTrades){
            can = true;
        }
        return can;
    }

    @Override
    public String toString() {
        return "Bronze{}";
    }
}
