package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Assert;
import ru.job4j.condition.Point;

public class PointTest {

    @Test
    public void when123To456() {
        Point first = new Point(1, 2, 3);
        Point second = new Point(4, 5, 6);
        double result = first.distance3d(second);
        assertThat(result, is(5.196152422706632));

    }

    @Test
    public void when004To023second() {
        Point first = new Point(0, 0, 4);
        Point second = new Point(0, 2, 3);
        double result = first.distance(second);
        assertThat(result, is(2.0));

    }
}