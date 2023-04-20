public class Gold extends MembershipType{
    private int tradesToday;
    public Gold(int minPoints, int maxPoint) {
        super(minPoints, maxPoint);
        this.setMinPoints(20);
        this.setMaxPoint(30);
    }

    @Override
    public boolean canTrade(Trade trade) {
        if(tradesToday < 20){
            return true;
        }
        return false;
    }

}
