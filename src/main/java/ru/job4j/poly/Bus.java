package ru.job4j.poly;

public class Bus implements Transport{
    @Override
    public void drive() {
        System.out.println("Bus drives ont he road");
    }

    @Override
    public void passengers(int numberOfPassengers) {
        System.out.println("Quantity of passengers" + numberOfPassengers);
    }

    @Override
    public double tankUp(int fuel) {
        return fuel * 1.7;
    }
}
