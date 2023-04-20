import java.time.LocalDateTime;
import java.util.stream.Stream;

public abstract class Trade {
    private String ID;
    private String symbol;
    private int quantity;
    private double price;
    private LocalDateTime tradeCreatedAt;

    public LocalDateTime getTradeCreatedAt(){
        return tradeCreatedAt;
    }

    public String getId() {
        return ID;
    }

    public void setId(String ID) {
        this.ID = ID;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <=0){
            this.price = 0.0;
        }else{
            this.price = price;
        }
    }

    Trade(String ID, String symbol, int quantity, double price){
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    Trade(String ID, String symbol, int quantity){
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
    }
@Override
    public String toString(){
        return this.ID + ":" + this.symbol + ":" + this.quantity + ":" + this.price;

    }

    public abstract double calcDividend();

}
