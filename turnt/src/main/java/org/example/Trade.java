package org.example;

import java.time.LocalDateTime;

public abstract class Trade {

    private String ID;
    private String symbol;
    private int quantity;
    private double price;
    private double dividend;
    private LocalDateTime localDateTime;

    public Trade(String ID, String symbol, int quantity, double price, double dividend){
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.dividend = dividend;
        this.localDateTime = LocalDateTime.now();
    }

    public Trade(String ID, String symbol, int quantity, double dividend){
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.dividend = dividend;
        this.localDateTime = LocalDateTime.now();
    }

    public Trade(String ID, String symbol, int quantity){
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.localDateTime = LocalDateTime.now();
    }

    public Trade(String ID, String symbol, double price, int quantity){
        this.ID = ID;
        this.symbol = symbol;
        this.price = price;
        this.quantity = quantity;
        this.localDateTime = LocalDateTime.now();
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


    public double getDividend() {
        return dividend;
    }

    public void setDividend(double dividend) {
        this.dividend = dividend;
    }

    public abstract double calcDividend();

    @Override
    public String toString() {
        return "Trade{" + "ID='" + ID + '\'' + ", symbol='" + symbol + '\'' + ", quantity=" + quantity + ", price=" + price + '}';
    }
}
