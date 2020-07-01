package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean condition = ab + ac > bc && ab + bc > ac && ac + bc > ab;
        return condition;
    }

    public static void main(String[] args) {
        boolean triangle = Triangle.exist(2, 2, 2);
        System.out.println(triangle);
    }
}
