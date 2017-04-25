package com.artur.kolos.point;

import com.artur.kolos.square.Square;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by Artur M on 25.04.2017.
 */
public class Karthesian {
    private Square square;
    private Karthesian karthesian;

    @Before
    public void setup(){
        square = new Square();
        karthesian = new Karthesian();
    }

    @Test
    public void shouldChangeFromKarthesian(){
        //given
        List<Point> list = square.getPointsOfSquare(1,new Point(0,1));

        //when
        double r = karthesian.change(list).get(1).getX();
        double theta = karthesian.change(list).get(1).getY();
        //then

        Assert.assertEquals((int) r ,1);
        Assert.assertEquals((int) theta,0);


    }
}
}
