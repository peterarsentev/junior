package ru.job4j.interview;

public class DeadLock {
    public static void main(String[] args) {
        final User tom = new User("Tom");
        final User bob = new User("Bob");
        new Thread(() -> tom.tack(bob)).start();
        new Thread(() -> bob.tack(tom)).start();
    }

    static class User {
        private final String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public synchronized void tack(User user) {
            System.out.format("%s tack name %s%n", this.name, user.getName());
            user.relies(this);
        }

        public synchronized void relies(User user) {
            System.out.format("%s relies %s %n", this.name, user.getName());
        }
    }
}
