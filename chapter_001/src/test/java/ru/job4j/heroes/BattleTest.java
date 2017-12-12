package ru.job4j.heroes;

import org.junit.Test;
import ru.job4j.heroes.character.BaseHero;
import ru.job4j.heroes.character.elf.MagElf;
import ru.job4j.heroes.character.endead.Necromancer;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class BattleTest {

    private final class SingleSolder implements Team {
        private final Hero hero;

        private SingleSolder(final Hero hero) {
            this.hero = hero;
        }

        @Override
        public boolean isLife() {
            return this.hero.isLife();
        }

        @Override
        public Hero turn() {
            return this.hero;
        }
    }

    @Test
    public void whenMagVSNecromancerThenMagWin() {
        Team elf = new SingleSolder(
                new MagElf(new BaseHero(100, 10))
        );
        Team necromancer = new SingleSolder(
                new Necromancer(new BaseHero(100, 5))
        );
        new Battle(elf, necromancer).init();
        assertThat(elf.isLife(), is(true));
        assertThat(necromancer.isLife(), is(false));
    }
}