package com.artur.kolos.circle;

import com.artur.kolos.point.Point;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artur M on 25.04.2017.
 */
public class Circle {

    public List<Point> getPointsOfCircle(double radius, Point center){
        List<Point> circlePoints = new ArrayList<>();
        double slice = 2 * 3.14 / 8;
        for (int i = 0; i < 8; i++)
        {
            double angle = slice * i;
            int newX = (int)(center.getX() + radius * Math.cos(angle));
            int newY = (int)(center.getY() + radius * Math.sin(angle));
            Point p = new Point(newX, newY);
            circlePoints.add(p);
        }
        return circlePoints;
    }

}
