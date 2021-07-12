package ru.job4j.oop.professions;

public class Dentist extends Doctor{

    public Dentist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Patient makeDiagnosis(String name, String diagnosis){
        return new Patient(name, new Diagnosis(diagnosis));
    }
}
