package ru.job4j.oop;

public class Battery {
    public static void main(String[] args) {
        Battery battery1 = new Battery(10);
        Battery battery2 = new Battery(5);
        battery1.exchange(battery2);
        System.out.println("First load: " + battery1.load + ". Second battery load: " + battery2.load + ".");
    }

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another){
        another.load += 1;
        this.load -= 1;
    }
}
