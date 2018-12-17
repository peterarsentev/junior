package ru.job4j.tracker;

public class StubInput implements Input {
    /**
     * Это после содержит последовательность ответом пользователя.
     * Например. Если пользователь
     * хочет выбрать добавления новой заявки ему нужно ввести:
     * 0 - выбор пунктам меня.
     * name - имя заявки
     * desc - описание заявки
     * y - выйти из трекера.
     */
    private final String[] value;

    /**
     * Поле считает количество вызовом метода ask.
     * При каждом вызове надо передвинуть указатель на новое число.
     */
    private int position;

    public StubInput(final String[] value) {
        this.value = value;
    }

    /**
     * Давайте рассмотрим, как работает этот метод.
     * у нас есть объект в котором содержаться за ранее продуманные ответы.
     * При последовательном вызове метода ask на надо возвращать соотвествующие данные.
     * Как если бы мы эммулировали поведение пользователя.
     * Ддя этого при каждом вызове метода ask мы увеличиваем счетчик и
     * при следующем вызове он вернут нам новое значение.
     */
    @Override
    public String ask(String question) {
        return this.value[this.position++];
    }

    @Override
    public int ask(String question, int[] range) throws MenuOutException {
        return 0;
    }
}
