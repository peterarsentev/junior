package ru.job4j.pattern.proxy;

import ru.job4j.tracker.ITracker;
import ru.job4j.tracker.Item;

import java.util.WeakHashMap;

public class TrackerCache implements ITracker {
    private final WeakHashMap<String, Item> cache = new WeakHashMap<>();

    @Override
    public Item add(Item item) {
        this.cache.put(item.getId(), item);
        return item;
    }

    @Override
    public Item findById(String id) {
        return this.cache.get(id);
    }

    @Override
    public boolean replace(String id, Item item) {
return true;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Item[] findAll() {
        return new Item[0];
    }

    @Override
    public Item[] findByName(String key) {
        return new Item[0];
    }
}
