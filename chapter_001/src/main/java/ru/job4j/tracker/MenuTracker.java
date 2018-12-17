package ru.job4j.tracker;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class MenuTracker {
}

class AddItem extends BaseAction {

    public AddItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String name = input.ask("Enter name:");
        String desc = input.ask("Enter description:");
        tracker.add(new Item(name, desc));
    }
}
