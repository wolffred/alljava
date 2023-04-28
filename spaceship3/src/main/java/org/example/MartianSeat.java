package org.example;

public class MartianSeat extends Seat{

    public MartianSeat() {
    }

    public MartianSeat(int ID, String name, boolean isBooked) {
        super(ID, name, isBooked);
    }



    @Override
    public String serveFood() {
        return "Serving Martian Food";
    }

    @Override
    public String getSeatType() {
        return "Martian Seat";
    }


//    @Override
//    public String toString() {
//        return "MartianSeat";
//    }
}