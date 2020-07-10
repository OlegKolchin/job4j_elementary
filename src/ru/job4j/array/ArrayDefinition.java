package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[4];
        names[0] = "Solid Snake";
        names[1] = "Revolver Ocelot";
        names[2] = "Vasiliy Pupkin";
        names[3] = "Commander Shepard";

        System.out.printf("%s%n%s%n%s%n%s", names[0], names[1], names[2], names[3]);

    }
}
