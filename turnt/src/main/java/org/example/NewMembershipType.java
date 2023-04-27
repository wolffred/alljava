package org.example;

public enum NewMembershipType {
    Bronze(5),
    Silver(10),
    Gold(20);

    private int maxTrades;

    NewMembershipType(int maxTrades){
        this.maxTrades = maxTrades;
    }

}
