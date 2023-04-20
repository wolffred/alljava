import java.time.LocalTime;

public enum MmembershipType {
    Bronze(5){
        public boolean canTrade(int dailyTradeNumber, double dailyTradeValue, double maximumTradeValue) {
            if(LocalTime.now().isBefore(LocalTime.of(8, 0))) {
                return false;
            }
            return dailyTradeNumber < Bronze.maxTrades;
        }
    },
    Silver(10){
        public boolean canTrade(int dailyTradeNumber, double dailyTradeValue, double maximumTradeValue) {
            return dailyTradeNumber < Silver.maxTrades && dailyTradeValue < maximumTradeValue;
        }
    },
    Gold(20){
        public boolean canTrade(int dailyTradeNumber, double dailyTradeValue, double maximumTradeValue) {
            if (dailyTradeNumber < Gold.maxTrades) {
                return true;
            } else {
                return false;
            }
        }
    };

    private int maxTrades;

    public int getMaxTrades() {
        return maxTrades;
    }

    public void setMaxTrades(int maxTrades) {
        this.maxTrades = maxTrades;
    }

    MmembershipType(int maxTrades) {
        this.maxTrades = maxTrades;
    }


    public abstract boolean canTrade(int dailyTradeNumber, double dailyTradeValue, double maximumTradeValue);



}
