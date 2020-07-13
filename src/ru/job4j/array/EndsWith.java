package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        if (word[word.length - 2] != post[0]) {
            result = false;

        }
        if (word[word.length - 1] != post[1]) {
            result = false;

        }
        return result;
    }
}
