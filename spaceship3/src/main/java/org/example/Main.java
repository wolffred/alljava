package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Human human = new Human(1, "Bob");
        Human human1 = new Human(2, "Bib");
        Human human2 = new Human(3, "Bab");
        Martian martian = new Martian(1, "#^%");


        List<HumanSeat> tempHumanSeats = new ArrayList<>();
        List<MartianSeat> tempMartianSeats = new ArrayList<>();

        Spaceship spa = new Spaceship(2, 10);
        spa.generateHumanSeats(tempHumanSeats);
        spa.generateMartianSeats(tempMartianSeats);


        spa.humanseats = tempHumanSeats;
        spa.martianseats = tempMartianSeats;
        spa.allSeats.addAll(spa.humanseats);
        spa.allSeats.addAll(spa.martianseats);



        spa.bookSeatForHuman(spa.humanseats.get(0), human);
        spa.bookSeatForHuman(spa.humanseats.get(1), human1);
        spa.bookSeatForHuman(spa.humanseats.get(1), human2);
        spa.bookSeatForMartian(spa.martianseats.get(1), martian);
        System.out.println(spa.allSeats);


        System.out.println(spa.getSeatType(human));
        System.out.println(spa.martianseats.get(1).getSeatType());


        Pluto pluto = new Pluto();
        System.out.println(pluto.whatIsPluto(human));
        System.out.println(pluto.whatIsPluto(martian));

        System.out.println(spa.areAllBooked());
        System.out.println(spa.isAllHumanSeatsBooked());


//        for(int i = 0; i < 10; i++){
//            System.out.println(spa.humseats.get(i));
//        }

    }
}