public abstract class MembershipType {

    private int minPoints;
    private int maxPoint;

    public MembershipType(int minPoints, int maxPoint) {
        this.minPoints = minPoints;
        this.maxPoint = maxPoint;
    }

    public int getMinPoints() {
        return minPoints;
    }

    public void setMinPoints(int minPoints) {
        this.minPoints = minPoints;
    }

    public int getMaxPoint() {
        return maxPoint;
    }

    public void setMaxPoint(int maxPoint) {
        this.maxPoint = maxPoint;
    };


    public abstract boolean canTrade(Trade trade);
}
