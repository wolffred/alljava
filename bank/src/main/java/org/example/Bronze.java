package org.example;

public class Bronze extends MembershipTypee{

        private int maxTrades = 5;
        @Override
        public boolean canTrade(int dailyTradeNumber) {
                return dailyTradeNumber < maxTrades;
        }
}
