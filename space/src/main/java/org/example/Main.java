package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Seats newseats = new Seats();

        Spaceship spaceship = new Spaceship(10,10);

        List<HumanSeat> humen = new ArrayList<>();

        spaceship.generateHumanSeats(humen);

        System.out.println(humen);

    }
}