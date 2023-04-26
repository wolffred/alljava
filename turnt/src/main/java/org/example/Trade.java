package org.example;

public class Trade {

    private String ID;
    private String symbol;
    private int quantity;
    private double price;

    public Trade(String ID, String symbol, int quantity, double price){
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public Trade(String ID, String symbol, int quantity){
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
    }


    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public String setPrice(double price) {
        if(price > 0 ){
            this.price = price;
            return "Price set";
        }else {
            return "Price not set";
        }
    }

    @Override
    public String toString() {
        return "Trade{" +
                "ID='" + ID + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
