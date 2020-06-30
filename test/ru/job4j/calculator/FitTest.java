package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        short in = 187;
        double out = Fit.manWeight(in);
        double expected = 100.05;
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void womanWeight() {
        short in = 187;
        double out = Fit.womanWeight(in);
        double expected = 88.55;
        Assert.assertEquals(expected, out, 0.01);
    }
}