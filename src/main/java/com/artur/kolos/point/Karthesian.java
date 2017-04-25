package com.artur.kolos.point;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artur M on 25.04.2017.
 */
public class Karthesian {

    public List<Point> changeToPolar(List<Point> list) {
        List<Point> polarPoints = new ArrayList<>();
        list.forEach( e -> {
            double r = Math.sqrt(e.getX()*e.getX() + e.getY()*e.getY());
            double theta= Math.atan2(e.getY(),e.getX());
            Point newPoint = new Point(r,theta);
            polarPoints.add(newPoint);
        });

        return polarPoints;
    }
}
