package com.artur.kolos.square;

import com.artur.kolos.point.Karthesian;
import com.artur.kolos.point.Point;
import com.artur.kolos.square.Square;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Artur M on 25.04.2017.
 */
public class SquareTest {

    private Square square;
    private Point point;
    private Karthesian karthesian;

    @Before
    public void setup(){
        square = new Square();
        karthesian = new Karthesian();
    }

    @Test
    public void shouldDrawSquare(){
        //given
        int length = 1;
        point = new Point(0,0);
        List<Point> points = Arrays.asList(new Point(0, 0),
                new Point(1, 0), new Point(1, 1), new Point(0, 1));

        //when
        List<Point> listOfPoints = square.getPointsOfSquare(length, point);

        //then
        listOfPoints.forEach(e -> System.out.println(e.toString()));
        points.forEach(e -> System.out.println(e.toString()));

        Assert.assertEquals(listOfPoints.get(1).toString(), points.get(1).toString());
    }

    @Test
    public void shouldChangeFromKarthesianToPolar(){
        //given
        List<Point> list = square.getPointsOfSquare(1,new Point(0,1));

        //when
        double r = karthesian.change(list).get(1).getX();
        double theta = karthesian.change(list).get(1).getY();
        //then

        Assert.assertEquals((int) r ,1);
        Assert.assertEquals((int) theta,0);

        karthesian.change(list).forEach(System.out::println);

    }

}