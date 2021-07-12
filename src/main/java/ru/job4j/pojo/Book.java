package ru.job4j.pojo;

public class Book {
    private String title;
    private int numOfPages;

    public Book(String title, int numOfPages) {
        this.title = title;
        this.numOfPages = numOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
}
