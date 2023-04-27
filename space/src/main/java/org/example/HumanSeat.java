package org.example;

public class HumanSeat extends Seat{


    public HumanSeat(int ID, String name) {
        super(ID, name);
    }


    public HumanSeat() {
    }

    public HumanSeat(int ID, String name, boolean isBooked) {
        super(ID, name, isBooked);
    }
}
