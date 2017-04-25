package com.artur.kolos;

import  com.artur.kolos.point.Point;
import  com.artur.kolos.square.Square;

/**
 * Created by Artur M on 25.04.2017.
 */
public class DrawingApp {

    public static void main(String[] args) {
        Draw draw = new Draw();
        draw.draw(new Square().getPointsOfSquare(10, new Point(5,5)));
    }
}

