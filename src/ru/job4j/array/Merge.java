package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int index1 = 0;
        int index2 = 0;
        while (index1 + index2 < rsl.length) {
            if (index1 < left.length && left[index1] < right[index2]) {
                rsl[index1 + index2] = left[index1++];
            } else {
                rsl[index1 + index2] = right[index2++];
            }
        }
        return rsl;
    }
}
