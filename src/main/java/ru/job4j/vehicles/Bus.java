package ru.job4j.vehicles;

public class Bus implements Vehicle{
    @Override
    public void move() {
        System.out.println("Bus drives on the road.");
    }
}
