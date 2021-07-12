package ru.job4j.oop.professions;

public class Surgeon extends Doctor {
    private int salary;

    public Surgeon(String name, String surname, String education, String birthday, String qualification, int salary) {
        super(name, surname, education, birthday, qualification);
        this.salary = salary;
    }

    public Patient makeDiagnosis(String name, String diagnosis) {
        return new Patient(name, new Diagnosis(diagnosis));
    }
}
