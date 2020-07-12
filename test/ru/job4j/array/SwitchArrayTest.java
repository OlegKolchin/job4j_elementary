package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap2to10() {
        int[] input = {12, 35, 14, 64, 66, 22, 24, 435, 75675, 10, 11};
        int[] expect = {12, 35, 11, 64, 66, 22, 24, 435, 75675, 10, 14};
        int[] rsl = SwitchArray.swap(input, 2, 10);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap3to4() {
        int[] input = {4, 5, 6, 7, 8};
        int[] expect = {4, 5, 6, 8, 7};
        int[] rsl = SwitchArray.swap(input, 3, 4);
        assertThat(rsl, is(expect));
    }
}