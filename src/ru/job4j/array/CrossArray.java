package ru.job4j.array;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        int index1 = 0;
        int index2 = 0;
        String s = "";
        for (index1 = 0; index1 < left.length; index1++) {
            if (left[index1] == right[index2]) {
                s = "" + (left[index1]);
                index2++;
            }
        }
        System.out.println(s);
    }
}
