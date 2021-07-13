package ru.job4j.tracker;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] newArray = new Item[findEqualNames(key)];
        int index = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getName().equals(key)) {
                newArray[index] = items[i];
                index++;
            }
        }
        return newArray;
    }

    private int findEqualNames(String key) {
        int equalNames = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getName().equals(key)) {
                equalNames++;
            }
        }
        return equalNames;
    }

    public Item[] findAll() {
        Item[] newArray = new Item[findNotNullCells()];
        int index = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                newArray[index] = items[i];
                index++;
            }
        }
        return newArray;
    }

    private int findNotNullCells() {
        int notNullCells = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                notNullCells++;
            }
        }
        return notNullCells;
    }
}