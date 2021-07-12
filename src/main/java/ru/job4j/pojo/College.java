package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setNameSurname("Иванов Иван Иванович");
        student.setGroup("Натурология");
        student.setDateOfEnrollment(new Date());
        System.out.println("ФИО: " + student.getNameSurname()
                + ". Группа: " + student.getGroup()
                + ". Дата поступления: " + student.getDateOfEnrollment() + ".");
    }
}
