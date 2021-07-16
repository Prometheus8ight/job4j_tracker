package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            boolean wrigthNum = false;
            while (!wrigthNum) {
                System.out.println(player + " введите число от 1 до 3:");
                int matches = Integer.parseInt(input.nextLine());
                if (matches <= 3 && matches >= 0) {
                    count -= matches;
                    wrigthNum = true;
                }
            }
            turn = !turn;
            if (count > 4) {
                System.out.println("Осталось " + count + " спичек");
            } else if (count > 1) {
                System.out.println("Осталось " + count + " спички");
            } else {
                System.out.println("Осталась " + count + " спичка");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
