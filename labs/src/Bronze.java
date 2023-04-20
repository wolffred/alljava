import java.time.LocalDateTime;

public class Bronze extends MembershipType{
    private  int tradesToday;
    public Bronze(int minPoints, int maxPoint) {
        super(minPoints, maxPoint);
        this.setMinPoints(1);
        this.setMaxPoint(10);
    }

    @Override
    public boolean canTrade(Trade trade) {

        LocalDateTime tradingStartTime = LocalDateTime.parse(LocalDateTime.now().toLocalDate() +"T10:00:00");
        if(tradesToday < 5 && trade.getTradeCreatedAt().isBefore(tradingStartTime)){
            return true;
        }
        return false;
    }

}
