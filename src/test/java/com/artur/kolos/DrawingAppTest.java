package com.artur.kolos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Artur M on 25.04.2017.
 */
public class DrawingAppTest {

    private DrawingApp drawingApp;

    @Before
    public void setup(){
        drawingApp = new DrawingApp();
    }

    @Test
    public void shouldAddTwoNumbers(){
        //given
        int a=3; int b=4;
        //when
        int result = drawingApp.add(a,b);
        //then
        Assert.assertEquals(7, result);
    }
}
