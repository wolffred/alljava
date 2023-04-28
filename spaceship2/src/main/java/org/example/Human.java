package org.example;

public class Human extends Passenger{
    public Human(int ID, String name) {
        super(ID, name);
    }

    @Override
    public void plutoBelief(Pluto pluto){
        System.out.println(pluto + " is a moon");
    }

}
