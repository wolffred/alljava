package org.example;

public class Martian {
    private int ID;
    private String name;
    private Seat seat;

    public Martian(int ID, String name) {
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


    public String getSeat() {
        return "Martian Seat";
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public String plutoBelief(Pluto pluto){
        return pluto + " is a planet";
    }
}

