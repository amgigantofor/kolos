package com.artur.kolos.point;

/**
 * Created by Artur M on 25.04.2017.
 */
public class Point {

    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Point: ("+x+","+y+")";
    }

    public double getY() {
        return y;
    }
}