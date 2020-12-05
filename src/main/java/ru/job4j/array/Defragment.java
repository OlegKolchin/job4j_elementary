package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int string = index; string < array.length; string++) {
                    if (array[string] != null) {
                        array = SwitchArray.swap(array, point, string);
                        break;
                    }
                }
            }
        }
        return array;
    }
}

