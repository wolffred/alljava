package org.example;

public enum MembershipType {
    Bronze(5){
        @Override
        public boolean canTrade(int dailyTradeNumber) {
            return dailyTradeNumber < Bronze.maxTrades;
        }
    },
    Silver(15){
        @Override
        public boolean canTrade(int dailyTradeNumber) {
            return dailyTradeNumber < Silver.maxTrades;
        }
    },
    Gold(20){
        @Override
        public boolean canTrade(int dailyTradeNumber) {
            return dailyTradeNumber < Gold.maxTrades;
        }
    };

    private final int maxTrades;
    MembershipType(int maxTrades){
        this.maxTrades = maxTrades;
    }

    public abstract boolean canTrade(int dailyTradeNumber);

    public static MembershipType assignMemberShip(int tradePoints){
        if (tradePoints <=0){};
        if(tradePoints < 10 && tradePoints > 0){
            return MembershipType.Bronze;
        }
        if(tradePoints < 20 && tradePoints > 9){
            return MembershipType.Silver;
        }
        else {
            return MembershipType.Gold;
        }
    }

}
