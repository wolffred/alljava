public class Trader {
    private String name;
    private Account account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double addTrade(Trade toAddTrade){
        double addTradeValue = this.account.getValue() + (toAddTrade.getPrice() * toAddTrade.getQuantity());

        return addTradeValue;
    }

}
