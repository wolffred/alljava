package org.example;

public class Person implements Cloneable{
    private String name;
    private int id;


    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void display(){
        System.out.println("ID: " + getId());
        System.out.println("NAME: " + getName());
    }
}
