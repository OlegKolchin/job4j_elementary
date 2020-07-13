package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class EqLastTest {

    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        assertThat(EqLast.check(left, right), is(true));
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        assertThat(EqLast.check(left, right), is(false));
    }
}