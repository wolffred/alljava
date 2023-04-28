package org.example;

import java.util.ArrayList;
import java.util.List;

public class Spaceship {
    private int numberOfHumanSeats;
    private int numberOfMartianSeats;

    private int seatNumber;
    List<HumanSeat> humanseats = new ArrayList<>(numberOfHumanSeats);

    List<MartianSeat> martianseats = new ArrayList<>(numberOfMartianSeats);

    List<Seat> allSeats = new ArrayList<>();

    private boolean allHumanSeatsBooked= true;


    public Spaceship(int numberOfHumanSeats, int numberOfMartianSeats) {
        this.numberOfHumanSeats = numberOfHumanSeats;
        this.numberOfMartianSeats = numberOfMartianSeats;
    }

    public List<HumanSeat> getHumanseats(){
        return this.humanseats;
    }

    public void setHumanseats(List<HumanSeat> huseats){
        this.humanseats.add((HumanSeat) huseats);
    }


    public List<MartianSeat> getMartianseats(){
        return this.martianseats;
    }

    public void setMartianseats(List<MartianSeat> mseats){
        this.martianseats.add((MartianSeat) mseats);
    }

    List<HumanSeat> generateHumanSeats(List<HumanSeat> seatsInShip) {
        for(int i = 0; i < numberOfHumanSeats; i++){
            HumanSeat seat = new HumanSeat();
            seat.setID(i);
            seatsInShip.add(seat);
        }

        return seatsInShip;

    }

    List<MartianSeat> generateMartianSeats(List<MartianSeat> seatsInShip) {
        for(int i = 0; i < numberOfMartianSeats; i++){
            MartianSeat seat = new MartianSeat();
            seat.setID(i);
            seatsInShip.add(seat);
        }

        return seatsInShip;

    }

    public boolean isAllHumanSeatsBooked() {
        return allHumanSeatsBooked;
    }

    public void setAllHumanSeatsBooked(boolean allHumanSeatsBooked) {
        this.allHumanSeatsBooked = allHumanSeatsBooked;
    }

    public boolean areAllBooked() {
        for (int i = 0; i < humanseats.size(); i++) {
            allHumanSeatsBooked = allHumanSeatsBooked && humanseats.get(i).getBooked();
        }
        this.setAllHumanSeatsBooked(allHumanSeatsBooked);
        return allHumanSeatsBooked;
    }

    public void bookSeatForHuman(Seat seat, Human human) {
        allHumanSeatsBooked = true;
        for (int i = 0; i < humanseats.size(); i++) {
            allHumanSeatsBooked = allHumanSeatsBooked && humanseats.get(i).getBooked();
        }
        //System.out.println(allHumanSeatsBooked);
        if(allHumanSeatsBooked == false){
        if (seat.getBooked() == false) {
            //seat.setID(human.getID());
            seat.setName(human.getName());
            seat.setBooked(true);
            seat.serveFood();
        } else{
            System.out.println("Seat Already Booked");
        }
        }
        else {
            System.out.println("All seats booked");
        }
    }

//    public void bookSeatForHuman(Seat seat, Human human) {
//        if (seat.getBooked() == false) {
//            //seat.setID(human.getID());
//            seat.setName(human.getName());
//            seat.setBooked(true);
//            seat.serveFood();
//        } else{
//            System.out.println("Seat Already Booked");
//        }
//    }

//    public void bookSeatForHuman(Seat seat, Human human) {
//        areAllBooked();
//        if (this.allHumanSeatsBooked == true) {
//            System.out.println("All Seats Booked");
//        }
//        else {
//            if (seat.getBooked() == false) {
//                //seat.setID(human.getID());
//                seat.setName(human.getName());
//                seat.setBooked(true);
//                seat.serveFood();
//            } else {
//                System.out.println("Seat Already Booked");
//            }
//
//        }
//    }

    public void bookSeatForMartian(Seat seat, Martian martian){
        //seat.setID(martian.getID());
        seat.setName(martian.getName());
        seat.setBooked(true);
        seat.serveFood();
    }

//    public String getSeatType(Human human){
//        for(Seat seat : allSeats){
//            if(seat.getID() == human.getID()){
//                return "Human Seat";
//            }
//        }
//        return null;
//    }

    public String getSeatType(Human human){
        return human.getSeat();
    }

    public String getSeatType(Martian martian){
        return martian.getSeat();
    }

//    public String getSeatType(Martian martian){
//        for(Seat seat : allSeats){
//            if(seat.getID() == martian.getID()){
//                return "Martian Seat";
//            }
//        }
//        return null;
//    }

}
