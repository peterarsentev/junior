package ru.job4j.loop;

public class Loop {
    public static void main(String[] args) {
        for (int index = 0; index != 10; index++) {
            if (index % 2 == 0) {
                continue;
            }
            System.out.println(index + ". line");
        }
//
//        int x = 0;
//        int y = 0;
//        while (y < 9) {
//            y = x * x;
//            System.out.println(String.format("y(%s) = %s", x, y));
//            x++;
//        }

        int x = 0;
        int y = 0;
        do {
            y = x * x;
            System.out.println(String.format("y(%s) = %s", x, y));
            x++;
        } while (y < 9);
    }
}
