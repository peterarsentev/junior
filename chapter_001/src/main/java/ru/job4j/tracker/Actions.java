package ru.job4j.tracker;

public class Actions {

    public static UserAction byKey(int key) {
        UserAction action = new UnsupportAction();
//        if (key == ADD) {
//            action = new AddItem();
//        } else if (key == UPDATE) {
//            action = new UpdateAction();
//        } else if (key == DELETE) {
//            action = new DeleteAction();
//        }
        return action;
    }
}
