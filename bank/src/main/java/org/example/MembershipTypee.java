package org.example;

public abstract class MembershipTypee {

    public static MembershipTypee assignMemberShip(int tradePoints){
        if (tradePoints <=0){};
        if(tradePoints < 10 && tradePoints > 0){
            return new Bronze();
        }
        if(tradePoints < 20 && tradePoints > 9){
            return new Silver();
        }
        else {
            return new Gold();
        }
    }

    public abstract boolean canTrade(int dailyTradeNumber);
}
