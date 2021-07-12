package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        Book book1 = new Book("Clean Code", 501);
        Book book2 = new Book("To Kill a Mockingbird", 674);
        Book book3 = new Book("One Hundred Years of Solitude", 856);
        Book book4 = new Book("Invisible Man", 789);

        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getTitle() + " - " + b.getNumOfPages());
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getTitle() + " - " + b.getNumOfPages());
        }

        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            if (b.getTitle().equals("Clean Code")) {
                System.out.println(b.getTitle() + " - " + b.getNumOfPages());
            }
        }
    }
}
