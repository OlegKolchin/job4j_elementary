package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void distance() {

        int x1 = 23;
        int y1 = 3;
        int x2 = 55;
        int y2 = 23;
        double expected = 37.73;
        double out = Point.distance(23, 3, 55, 23);
        Assert.assertEquals(expected, out, 0.01);

    }
}