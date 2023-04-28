package org.example;

public class Martian extends Passenger{
    public Martian(int ID, String name) {
        super(ID, name);
    }

    @Override
    public void plutoBelief(Pluto pluto){
        System.out.println(pluto + " is a planet");
    }

}
