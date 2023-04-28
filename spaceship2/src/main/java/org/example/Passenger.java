package org.example;

public class Passenger {

    private int ID;
    private String name;

    public Passenger(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public void plutoBelief(Pluto pluto){
        System.out.println(pluto + " is a moon");
    }


    @Override
    public String toString() {
        return "Passenger{" + "ID=" + ID + ", name='" + name + '\'' + '}';
    }
}
