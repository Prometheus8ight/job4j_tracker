package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        String userInput = scanner.nextLine();
        Random random = new Random();
        int randomInt = random.nextInt(3);
        if (randomInt == 0) {
            System.out.println("Да");
        } else if (randomInt == 1) {
            System.out.println("Нет");
        } else {
            System.out.println("Может быть");
        }
    }
}
