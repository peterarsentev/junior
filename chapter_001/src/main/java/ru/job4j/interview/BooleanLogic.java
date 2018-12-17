package ru.job4j.interview;

public class BooleanLogic {
    public static class User {
        public boolean isActive() {
            return false;
        }
    }

    public static void main(String[] args) {
        User user = null;
        if (user != null && user.isActive()) {
            System.out.println("This user is active");
        }

        if (user != null & user.isActive()) {
            System.out.println("This user is active");
        }
    }
}
