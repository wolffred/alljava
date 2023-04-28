package org.example;

public class Seat {
    private int ID;
    private String name;
    private Passenger passenger;
    private boolean isbooked;


    public Seat() {

    }

    public Seat(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public void setBooked(boolean booked){
        this.isbooked = booked;
    }

    public void serveMeal(){
        System.out.println("Serve Meal");
    }


    @Override
    public String toString() {
        return "Seat{" +"ID=" + ID +", name='" + name + '\'' +", passenger=" + passenger +", isbooked=" + isbooked + '}';
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

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public boolean isIsbooked() {
        return isbooked;
    }

    public void setIsbooked(boolean isbooked) {
        this.isbooked = isbooked;
    }
}
