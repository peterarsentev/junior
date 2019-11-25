package ru.job4j.ru.job4j.dagger;

import dagger.Component;

@Component(modules = InputModule.class)
public interface InputComponent {
    Calc instance();
}
