package ru.job4j.oop.professions;

public class Programmer extends Engineer{

    public Programmer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    @Override
    public void doSomeWork() {
        super.doSomeWork();
    }
}
