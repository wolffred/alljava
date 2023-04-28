package org.example;

public class HumanSeat extends Seat{

    public HumanSeat() {
    }

    public HumanSeat(int ID, String name, boolean isBooked) {
        super(ID, name, isBooked);
    }

    @Override
    public String serveFood() {
        return "Serving Human Food";
    }

    @Override
    public String getSeatType() {
        return "Human Seat";
    }

    //    @Override
//    public String toString() {
//        return "HumanSeat";
//    }
}
