package ru.job4j.pattern;

import ru.job4j.tracker.ITracker;
import ru.job4j.tracker.Item;

import java.util.ArrayList;
import java.util.List;

public class TrackerSender implements ITracker, Observe<Messenger<Item>> {

    private final ITracker tracker;
    private final List<Messenger<Item>> msgs = new ArrayList<>();

    public TrackerSender(final ITracker tracker) {
        this.tracker = tracker;
    }

    @Override
    public void subscribe(Messenger<Item> client) {
        this.msgs.add(client);
    }

    @Override
    public void unsubscribe(Messenger<Item> client) {
        this.msgs.remove(client);
    }

    @Override
    public Item add(final Item item) {
        this.tracker.add(item);
        this.msgs.forEach(msg -> msg.send(item));
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

    @Override
    public Item findById(String id) {
        return null;
    }
}
