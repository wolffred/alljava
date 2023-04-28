package org.example;

import java.util.ArrayList;
import java.util.List;

public class Spaceship {
    private int capacity;
    List<Seat> seats;

    public Spaceship(int capacity) {
        this.capacity = capacity;
        this.seats = new ArrayList<>(capacity);
    }

    public void bookSeat(Passenger passenger){
        if(seats.size() < capacity){
            if(passenger instanceof Human){
                Seat newHumanSeat = new HumanSeat();
                newHumanSeat.setBooked(true);
                newHumanSeat.serveMeal();
                newHumanSeat.setPassenger(passenger);
                seats.add(newHumanSeat);
            }
            else if (passenger instanceof Martian){
                Seat newMartianSeat = new MartianSeat();
                newMartianSeat.setBooked(true);
                newMartianSeat.serveMeal();
                newMartianSeat.setPassenger(passenger);
                seats.add(newMartianSeat);
            }
        }
        else{
            System.out.println("Seats full");
        }
    }

}
