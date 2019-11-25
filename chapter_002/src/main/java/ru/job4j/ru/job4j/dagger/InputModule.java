package ru.job4j.ru.job4j.dagger;

import dagger.Module;
import dagger.Provides;
import ru.job4j.tracker.ConsoleInput;
import ru.job4j.tracker.Input;

@Module
public class InputModule {
    @Provides
    public static Input provideInput() {
        return new ConsoleInput();
    }
}
