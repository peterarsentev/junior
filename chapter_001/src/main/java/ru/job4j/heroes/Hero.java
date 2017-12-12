package ru.job4j.heroes;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public interface Hero {

    void upgrade(Hero comrade);

    void degrade(Hero enemy);

    void damage(int value);

    boolean isLife();

    boolean actionToTeam();

    void skills(boolean up);
}
