package ru.job4j.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Search {
    public static void main(String[] args) throws IOException {
        Path start = Paths.get("C:\\projects\\");
        Files.walkFileTree(start, new PrintFiles());
    }

    public static List<String> search(String root, String ext) {
        return null;
    }
}
