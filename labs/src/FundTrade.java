public class FundTrade extends Trade {

    private double dividend;
    private double rate;

    public double getDividend() {
        return dividend;
    }

    public void setDividend(double dividend) {
        this.dividend = dividend;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    FundTrade(String ID, String symbol, int quantity, double price, double dividend, double rate) {
        super(ID, symbol, quantity, price);
        this.dividend = dividend;
        this.rate = rate;
    }

    @Override
    public double calcDividend() {
        dividend = this.getPrice() * this.rate;
        return dividend;
    };
}
