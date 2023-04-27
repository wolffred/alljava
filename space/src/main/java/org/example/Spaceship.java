package org.example;

import java.util.ArrayList;
import java.util.List;

public class Spaceship {
    private BookingSystem book;
    public Seats myseats;
    private int numberOfHumanSeats;
    private int numberOfMartianSeats;

    private int seatNumber;
    List<HumanSeat> humseats = new ArrayList<>(numberOfHumanSeats);

    List<MartianSeat> martseats = new ArrayList<>(numberOfMartianSeats);


    public Spaceship(int numberOfHumanSeats, int numberOfMartianSeats) {
        this.numberOfHumanSeats = numberOfHumanSeats;
        this.numberOfMartianSeats = numberOfMartianSeats;
    }

    public BookingSystem getBook() {
        return book;
    }

    public void setBook(BookingSystem book) {
        this.book = book;
    }


    public void bookSeat(Seat seat, Human human){
        seat.setName(human.getName());
        seat.setID(human.getID());
        seat.setBooked(true);
    }



    List<HumanSeat> generateHumanSeats(List<HumanSeat> seatsInShip) {
        for(int i = 0; i < numberOfHumanSeats; i++){
            HumanSeat seat = new HumanSeat();
            seatsInShip.add(seat);
        }

        return seatsInShip;

    }


}
