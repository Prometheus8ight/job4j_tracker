package ru.job4j.oop;

public class Error {
    public static void main(String[] args) {
        Error error = new Error();
        Error error1 = new Error(true, -1, "Ошибка компиляции");
        error.printInfo();
        error1.printInfo();
    }
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активность: " + this.active);
        System.out.println("Статус: " + this.status);
        System.out.println("Сообщение: " + this.message);
    }
}
