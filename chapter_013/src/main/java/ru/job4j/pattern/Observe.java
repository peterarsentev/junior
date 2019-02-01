package ru.job4j.pattern;

import java.util.ArrayList;
import java.util.List;

public interface Observe<T> {


    void subscribe(T client);

    void unsubscribe(T client);
}
