package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ab + bc > ac && ac + bc > ab;
    }

    public static void main(String[] args) {
        boolean triangle = Triangle.exist(2, 2, 8);
        System.out.println(triangle);
    }
}
