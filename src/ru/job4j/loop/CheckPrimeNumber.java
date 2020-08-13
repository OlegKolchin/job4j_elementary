package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;

        for (int divider = 2; divider < number; divider++) {
            if (number % divider == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}