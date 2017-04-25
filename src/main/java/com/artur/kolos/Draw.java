package com.artur.kolos;

import com.artur.kolos.point.Point;
import java.util.List;
/**
 * Created by Artur M on 25.04.2017.
 */
public class Draw {
    public void draw(List<Point> listOfPoints){
        listOfPoints.forEach(System.out::println);
    }
}
