package ru.job4j.tracker;

import java.util.Random;

public class Tracker implements ITracker {

    private final Item[] items = new Item[100];

    private int position = 0;

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    @Override
    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items[index] = item;
        }
        return rsl;
    }

    @Override
    public void delete(String id) {
        items[indexOf(id)] = null;
    }

    @Override
    public Item[] findAll() {
        return items;
    }

    @Override
    public Item[] findByName(String key) {
        return new Item[0];
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }


    @Override
    public Item findById(String id) {
        return items[indexOf(id)];
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item("Bug 1");
        item.setId("34");
        tracker.replace("34", item);
    }
}
