package com.artur.kolos.square;
import com.artur.kolos.point.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Artur M on 25.04.2017.
 */

public class Square{

    public List<Point> getPointsOfSquare(int length, Point startingPoint) {
        Point p1 = new Point(startingPoint.getX()+length, startingPoint.getY());
        Point p2 = new Point(startingPoint.getX()+length, startingPoint.getY()+length);
        Point p3 = new Point(startingPoint.getX(), startingPoint.getY()+length);
        return Arrays.asList(startingPoint,p1,p2,p3);
    }

}
