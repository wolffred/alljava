package org.example;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Trade {
    private String ID;
    private String symbol;
    private int quantity;
    private double price;
    private LocalTime localTime;

    public Trade(String ID, String symbol, int quantity, double price) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        localTime = LocalTime.now();
    }

    public Trade(String ID, String symbol, int quantity) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
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
        if (price > 0) {
            this.price = price;
        }
    }

    public abstract double calcDividend();

    @Override
    public String toString() {
        return "Trade{" +
                "ID='" + ID + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trade trade = (Trade) o;
        return ID.equals(trade.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}
