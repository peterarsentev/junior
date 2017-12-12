package ru.job4j.heroes.character;

import ru.job4j.heroes.Hero;
import ru.job4j.heroes.character.elf.MagElf;

import java.util.Random;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class BaseHero implements Hero {
    private static final Random RM = new Random();
    private int hp;
    private final int hit;
    private boolean privilege = false;

    public BaseHero(final int hp, final int hit) {
        this.hp = hp;
        this.hit = hit;
    }

    @Override
    public void upgrade(Hero comrade) {
        comrade.skills(true);
    }

    @Override
    public void degrade(Hero enemy) {
        enemy.damage((this.privilege ? 10 : 1) * this.hit);
    }

    @Override
    public void damage(int value) {
        this.hp -= value;
    }

    @Override
    public boolean isLife() {
        return this.hp > 0;
    }

    @Override
    public boolean actionToTeam() {
        return false;
    }

    @Override
    public void skills(boolean up) {
        this.privilege = up;
    }
}
