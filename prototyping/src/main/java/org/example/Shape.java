package org.example;

public abstract class Shape {
    private double x;
    private double y;
    private String colour;

    public Shape(double x, double y, String colour) {
        this.x = x;
        this.y = y;
        this.colour = colour;
    }

    //public abstract Object clone(Shape);
}
