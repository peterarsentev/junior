package ru.job4j;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class StreamUsage {
    public static class Task {
        private final String name;
        private final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }
    }

    private static final Logger LOG = LogManager.getLogger(StreamUsage.class.getName());

    public static void main(String[] args) {
        LOG.trace("trace message");
        LOG.debug("debug message");
        LOG.info("info message");
        LOG.warn("warn message");
        LOG.error("error message");
//        List<Task> tasks = List.of(
//                new Task("Bug #1", 100),
//                new Task("Task #2", 100),
//                new Task("Bug #3", 100)
//        );
//        long total = 0L;
//        for (Task task : tasks) {
//           total += task.spent;
//        }
    }
}
