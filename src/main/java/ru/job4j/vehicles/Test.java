package ru.job4j.vehicles;

public class Test {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane();
        Vehicle vehicle1 = airplane1;
        Airplane airplane2 = new Airplane();
        Vehicle vehicle2 = airplane2;
        Bus bus1 = new Bus();
        Vehicle vehicle3 = bus1;
        Bus bus2 = new Bus();
        Vehicle vehicle4 = bus2;
        Train train1 = new Train();
        Vehicle vehicle5 = train1;
        Train train2 = new Train();
        Vehicle vehicle6 = train2;
        Vehicle[] vehicles = {vehicle1, vehicle2, vehicle3,
        vehicle4, vehicle5, vehicle6};

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].move();
        }
    }
}
