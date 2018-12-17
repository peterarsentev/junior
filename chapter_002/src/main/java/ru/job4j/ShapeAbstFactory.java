package ru.job4j;

public interface ShapeAbstFactory {
    TriangleShape createTriangle();

    RectangleShape createRectangle();

    EmptyShape createEmpty();
}
