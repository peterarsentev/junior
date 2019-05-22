package ru.job4j.array;

import java.util.Arrays;

public class OpArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
//        numbers[-1] = 100;

        for (int index = 0; index != 5; index++) {
            numbers[index] = numbers.length - index;
        }
        for (int index = 0; index != 5; index++) {
            int value = numbers[index];
            System.out.println(value);
        }

        String[] flats = {
                "Lenina, 45", "Pushkina, 1",
                "Michurina 36", "Kirova, 25",
                "Demitriva, 1"
        };

        int[] data = {5, 3, 2, 1, 4};
        int tmp = data[0];
        data[0] = data[3];
        data[3] = tmp;
        System.out.println(Arrays.toString(data));

        int[][] matrix = new int[10][];

        int[][] table = new int[5][5];
        int count = 0;
        for (int out = 0; out != 5; out++) {
            for (int inner = 0; inner != 5; inner++) {
                table[out][inner] = count++;
            }
        }
        for (int index = 0; index != 5; index++) {
            System.out.println(Arrays.toString(table[index]));
        }

        int[][] field = {
                {0, 0, 1},
                {1, 0, 0},
                {0, 1, 0}
        };
        int temp = field[1][1]; // 0
        field[1][1] = field[2][1]; // 1 > 0
        field[2][1] = temp; // 0 > 1

        temp = field[0][2]; // 0
        field[0][2] = field[1][2]; // 1 > 0
        field[1][2] = temp; // 0 > 1

        for (int index = 0; index != 3; index++) {
            System.out.println(Arrays.toString(field[index]));
        }
    }
}
