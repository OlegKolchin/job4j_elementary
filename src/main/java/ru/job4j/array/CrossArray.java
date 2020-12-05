package ru.job4j.array;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        String s = "";
        for (int index = 0; index < left.length; index++) {
            if (left[index] == right[index]) {
                s = "" + (left[index]);
            }
        }
        System.out.print(s);
    }
}
