package ru.job4j.vehicles;

public class Airplane implements Vehicle{
    @Override
    public void move() {
        System.out.println("Airplane flies at the sky.");
    }
}
