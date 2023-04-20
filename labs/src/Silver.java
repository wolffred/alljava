public class Silver extends MembershipType{
    private int tradesToday;

    public int getTradesToday() {
        return tradesToday;
    }

    public void setTradesToday(int tradesToday) {
        this.tradesToday = tradesToday;
    }

    public int getMaxTrades() {
        return maxTrades;
    }

    public void setMaxTrades(int maxTrades) {
        this.maxTrades = maxTrades;
    }

    private int maxTrades;
    public Silver(int minPoints, int maxPoint) {
        super(minPoints, maxPoint);
        this.setMinPoints(11);
        this.setMaxPoint(19);
    }

    @Override
    public boolean canTrade(Trade trade) {
        if(maxTrades != 0 && tradesToday < maxTrades){
            return true;
        }else if (tradesToday < 10){
            return true;
        }
        return false;
    }

}

