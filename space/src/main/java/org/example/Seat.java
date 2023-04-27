package org.example;

public  class Seat {
    private int ID;
    private String name;
    private boolean isBooked = false;


    public Seat() {

    }

    public Seat(int ID, String name) {
        this.ID = ID;
        this.name = name;
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


    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}
