package ru.job4j.oop.professions;

public class Doctor extends Profession {
    private String qualification;

    public Doctor(String name, String surname, String education, String birthday, String qualification) {
        super(name, surname, education, birthday);
        this.qualification = qualification;
    }

    public Patient makeDiagnosis(String name, String diagnosis) {
        return new Patient(name, new Diagnosis(diagnosis));
    }
}
