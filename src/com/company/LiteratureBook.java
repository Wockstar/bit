package com.company;

public class LiteratureBook extends Book {
private String author;
private String publishedYear;

    public LiteratureBook() {
    }

    public LiteratureBook(String author, String publishedYear) {
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public LiteratureBook(String name, String code, int pages, String author, String publishedYear) {
        super(name, code, pages);
        this.author = author;
        this.publishedYear = publishedYear;
    }

    @Override
    String getBookData() {
        return super.getBookData() + author + " " + publishedYear;
    }
}
