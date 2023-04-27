package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Human human = new Human(1, "Bob");
        Martian martian = new Martian(1, "#^%");

        List<HumanSeat> humen = new ArrayList<>();

        List<MartianSeat> mart = new ArrayList<>();

        Spaceship spa = new Spaceship(10, 10);

        spa.generateHumanSeats(humen);

        spa.generateMartianSeats(mart);

        spa.humseats = humen;
        spa.martseats = mart;
        spa.allSeats.addAll(spa.humseats);
        spa.allSeats.addAll(spa.martseats);


        spa.bookSeatForHuman(spa.humseats.get(1), human);
        System.out.println(spa.allSeats);


        System.out.println(spa.getSeatType(human));

        System.out.println(spa.humseats.get(1).serveFood());
        System.out.println("j");


//        for(int i = 0; i < 10; i++){
//            System.out.println(spa.humseats.get(i));
//        }

    }
}