package org.example;

public class Main {
    public static void main(String[] args) {

        Passenger human = new Human(1, "Emma");
        Passenger martian = new Martian(1243, "Ekow");
        Spaceship zura = new Spaceship(2);

        zura.bookSeat(martian);
        zura.bookSeat(human);

        System.out.println(zura.seats);

    }
}