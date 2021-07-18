package ru.job4j.vehicles;

public class Train implements Vehicle{
    @Override
    public void move() {
        System.out.println("Train rides on the rails.");
    }
}
