package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (index = array.length - 1; index > point; index--) {
                    if (array[index] != null) {
                        int string = index;
                        array = SwitchArray.swap(array, point, string);
                    }

                }

            }

        }
        return array;
    }
}

