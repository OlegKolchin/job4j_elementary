package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;

        }
        for (int divider = 2; divider < number; divider++) {
            if (number % divider == 0) {
                prime = false;
                break;
            }

        }
        return prime;
    }
}