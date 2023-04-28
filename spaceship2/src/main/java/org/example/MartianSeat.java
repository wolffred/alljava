package org.example;

public class MartianSeat extends Seat{

    public MartianSeat() {
    }

    public MartianSeat(int ID, String name) {
        super(ID, name);
    }

    @Override
    public void serveMeal() {
        System.out.println("Serve Martian Meal");;
    }

}
