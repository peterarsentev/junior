package ru.job4j.pattern.proxy;

import ru.job4j.tracker.ITracker;
import ru.job4j.tracker.Item;

public class TrackerProxy implements ITracker {

    private final ITracker cache;
    private final ITracker sql;

    public TrackerProxy(ITracker cache, ITracker sql) {
        this.cache = cache;
        this.sql = sql;
    }

    @Override
    public Item add(Item item) {
        this.sql.add(item);
        this.cache.add(item);
        return item;
    }

    @Override
    public Item findById(String id) {
        Item item = this.cache.findById(id);
        if (item == null) {
            item = this.sql.findById(id);
            this.cache.add(item);
        }
        return item;
    }

    @Override
    public void replace(String id, Item item) {

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
