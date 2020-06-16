package ru.job4j.io;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrimeFile {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream out = new FileOutputStream("log.txt");
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        System.out.println("Hello, world");
        System.out.println("Log 3");
        System.setOut(def);
        System.out.println("Log 4");
    }
}
