package ru.job4j.tracker;

import java.util.Random;

public class Tracker implements ITracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    @Override
    public void replace(String id, Item item) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Item[] findAll() {
        //   получение списка всех заявок - возвращает копию массива this.items без null элементов;
        Item[] notNullitems = new Item[position];

        int size=0;

        for (Item i: this.items) {
            Item tmp = i;
            if(tmp!=null) {
                notNullitems[size++]=tmp;
            }
        }
        Item [] notNullitemsCut = new Item[size];
        System.arraycopy(notNullitems,0,notNullitemsCut,0,size);
        return notNullitemsCut;
    }

    @Override
    public Item[] findByName(String key) {
        return new Item[0];
    }

    @Override
    public Item findById(String id) {
        return null;
    }

    /**
     * Метод генерирует уникальный ключ для задаявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item("Bug 1");
        System.out.println(item.getId()); // here will be null,
        Item saved = tracker.add(item);
        System.out.println(saved.getId()); // where will be not null.
    }
}
