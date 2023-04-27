package org.example;

import java.util.ArrayList;
import java.util.List;

public class Spaceship {
    private int numberOfHumanSeats;
    private int numberOfMartianSeats;

    private int seatNumber;
    List<HumanSeat> humseats = new ArrayList<>(numberOfHumanSeats);

    List<MartianSeat> martseats = new ArrayList<>(numberOfMartianSeats);

    List<Seat> allSeats = new ArrayList<>();


    public Spaceship(int numberOfHumanSeats, int numberOfMartianSeats) {
        this.numberOfHumanSeats = numberOfHumanSeats;
        this.numberOfMartianSeats = numberOfMartianSeats;
    }

    public List<HumanSeat> getHumseats(){
        return this.humseats;
    }

    public void setHumseats(List<HumanSeat> huseats){
        this.humseats.add((HumanSeat) huseats);
    }


    public List<MartianSeat> getMartseats(){
        return this.martseats;
    }

    public void setMartseats(List<MartianSeat> mseats){
        this.martseats.add((MartianSeat) mseats);
    }

    List<HumanSeat> generateHumanSeats(List<HumanSeat> seatsInShip) {
        for(int i = 0; i < numberOfHumanSeats; i++){
            HumanSeat seat = new HumanSeat();
            seatsInShip.add(seat);
        }

        return seatsInShip;

    }

    List<MartianSeat> generateMartianSeats(List<MartianSeat> seatsInShip) {
        for(int i = 0; i < numberOfMartianSeats; i++){
            MartianSeat seat = new MartianSeat();
            seatsInShip.add(seat);
        }

        return seatsInShip;

    }

    public void bookSeatForHuman(Seat seat, Human human){
        seat.setID(human.getID());
        seat.setName(human.getName());
        seat.setBooked(true);
    }

    public void bookSeatForMartian(Seat seat, Human human){
        seat.setID(human.getID());
        seat.setName(human.getName());
        seat.setBooked(true);
    }

    public String getSeatType(Human human){
        for(Seat seat : allSeats){
            if(seat.getID() == human.getID()){
                return "Human Seat";
            }
        }
        return null;
    }

    public String getSeatType(Martian martian){
        for(Seat seat : allSeats){
            if(seat.getID() == martian.getID()){
                return "Martian Seat";
            }
        }
        return null;
    }



}
