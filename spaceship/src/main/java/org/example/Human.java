package org.example;

public class Human {
    private int ID;
    private String name;

    public Human(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String plutoBelief(Pluto pluto){
        return pluto + " is a moon";
    }
}
