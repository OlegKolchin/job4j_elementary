package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int count = 0; count < data.length; count++) {
            int min = MinDiapason.findMin(data, count, data.length - 1);
            int index = FindLoop.indexOf(data, min, count, data.length - 1);

            data = SwitchArray.swap(data, index, count);

        }
        return data;
    }
}
