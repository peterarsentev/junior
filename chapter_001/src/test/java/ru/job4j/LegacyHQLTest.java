package ru.job4j;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LegacyHQLTest {

    @Test
    public void whenWithoutQuestionMark() {
        assertThat(
                new LegacyHQL().convert("select * from user as ap"),
                is("select * from user as ap")
        );
    }

    @Test
    public void whenSingleQuestionMark() {
        assertThat(
                new LegacyHQL().convert("select * from user where id = ?"),
                is("select * from user where id = ?0")
        );
    }

    @Test
    public void whenMultipleQuestionMark() {
        assertThat(
                new LegacyHQL().convert("select * from user where id = ? and name = ? and last_date > ?"),
                is("select * from user where id = ?0 and name = ?1 and last_date > ?2")
        );
    }
}