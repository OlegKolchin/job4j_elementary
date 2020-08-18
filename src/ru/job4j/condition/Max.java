package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        int result = first > max(second, third) ? first : max(second, third);
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {
        int result = first > max(second, third, fourth) ? first : max(second, third, fourth);
        return result;
    }

    public static void main(String[] args) {
        int result = Max.max(33, 55);
        System.out.println(result);

    }
}
