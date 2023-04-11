package com.example.homework12.hw12;


public class Book {
    private String title;
    private int publishingYear;
    private Author author;

    public Book(String title, Author author, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        if (publishingYear > 2050 || publishingYear < 1500) {
            throw new RuntimeException("Invalid publishing year: " + publishingYear);
        }
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear > 2050 || publishingYear < 1500) {
            throw new RuntimeException("Invalid publishing year: " + publishingYear);
        }
        this.publishingYear = publishingYear;
    }

}