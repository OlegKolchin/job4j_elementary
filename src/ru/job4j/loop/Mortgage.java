package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        percent /= 100;

        while (salary < amount + amount * percent)  {

            amount += amount * percent - salary;
            year += 1;
        }
        return year;
    }
}
