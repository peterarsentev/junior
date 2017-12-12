package ru.job4j.condition;

/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
//        if ("Привет, Бот".equals(question)) {
//            rsl = ...;
//        } else if (....) {
//            rsl = ..;
//        }
        return rsl;
    }
}
