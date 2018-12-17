package ru.job4j;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static class Task {
        private final String name;
        private final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }
    }

    public static void main(String[] args) {
        System.out.println(1.0 == 1);
        List<Task> tasks = null;
        List<Task> bugs = tasks.stream().filter(
                task -> task.name.contains("Bug")
        ).collect(Collectors.toList());
        bugs.forEach(System.out::println);

        List<String> names = tasks.stream().map(
                task -> task.name
        ).collect(Collectors.toList());

        long total = tasks.stream().map(
                task -> task.spent
        ).reduce(0L, Long::sum);
    }
}
