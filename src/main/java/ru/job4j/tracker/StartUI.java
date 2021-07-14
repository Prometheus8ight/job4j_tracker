package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String date = item.getCreated().format(dateTimeFormatter);
        System.out.println(date);
        Item item2 = new Item();
        System.out.println(item2);
    }
}
