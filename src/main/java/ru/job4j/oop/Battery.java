package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another){
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery(10);
        Battery battery2 = new Battery(5);
        battery1.exchange(battery2);
        System.out.println("First load: " + battery1.load + ". Second battery load: " + battery2.load + ".");
    }
}
