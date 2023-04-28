package org.example;

public class Pluto {

    public String whatIsPluto(Human human){
        return "Pluto is a moon";
    }

    public String whatIsPluto(Martian martian){
        return "Pluto is a Planet";
    }

    @Override
    public String toString() {
        return "Pluto";
    }
}
