package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To1Then3() {
        int result = Max.max(3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax4To4Then4() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax4To3To5Then5() {
        int result = Max.max(3, 4, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax33To35To40To1Then40() {
        int result = Max.max(33, 35, 40, 1);
        assertThat(result, is(40));
    }
}