package org.example;

public class Seat {
    private int ID;
    private String name;
    private boolean isBooked;

    public Seat() {

    }
    public Seat(int ID, String name, boolean isBooked) {
        this.ID = ID;
        this.name = name;
        this.isBooked = isBooked;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean getBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        this.isBooked = booked;
    }
//
//    public boolean bookSeat(){
//        this.isBooked = true;
//        return this.isBooked;
//
//    }

    public String serveFood(){
        return "Serving normal food";
    }


    @Override
    public String toString(){
        return this.getName() + this.getID();
    }
}
