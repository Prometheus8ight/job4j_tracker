package ru.job4j.oop.professions;

public class Programmer extends Engineer {
    private int salary;

    public Programmer(String name, String surname, String education, String birthday, String qualification, int salary) {
        super(name, surname, education, birthday, qualification);
        this.salary = salary;
    }

    @Override
    public void doSomeWork() {
        super.doSomeWork();
    }
}
