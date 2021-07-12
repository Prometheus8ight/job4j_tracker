package ru.job4j.oop.professions;

public class Patient {
    private String name;
    private Diagnosis diagnosis;

    public Patient(String name, Diagnosis diagnosis) {
        this.name = name;
        this.diagnosis = diagnosis;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }
}
