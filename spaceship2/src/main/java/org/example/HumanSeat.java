package org.example;

public class HumanSeat extends Seat{


    public HumanSeat() {
    }

    public HumanSeat(int ID, String name) {
        super(ID, name);
    }


    @Override
    public void serveMeal() {
        System.out.println("Serve Human Meal");;
    }


}
