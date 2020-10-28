package com.company;
import java.util.ArrayList;

public class Library {
    private String name;
    private String city;
    private String country;
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Book> books_by_code = new ArrayList<>();
    ArrayList<Book> books_by_pages = new ArrayList<>();

    public Library() {
    }

    public Library(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    void addBook(Book a){
        books.add(a);
    }
    void printLibrary(){
        System.out.println(name + " " + city + " " + country );
        for (int i=0;i<books.size();i++){
            System.out.println(books.get(i).getBookData());
        }
    }
    public String searchBookByName(String name){
        for (Book b:books){
            if (name.equals(b.getName())){
                return b.getBookData();
            }
        }
        return "Book not found";
    }
    public void searchBookByCode(String code) {
        for (Book b : books) {
            if (code.equals(b.getCode())) {
                books_by_code.add(b);

            }
        }
        if (books_by_code.size() == 0) {
            System.out.println("Books by this code not found");
        }else {
            for(Book b:books_by_code){
                System.out.println(b.getBookData());
            }
        }
    }
    public void searchBookByPages(int min_pages,int max_pages) {
        for (Book b : books) {
            if (b.getPages()>=min_pages && b.getPages()<=max_pages) {
                books_by_pages.add(b);

            }
        }
        if (books_by_pages.size() == 0) {
            System.out.println("Books by this range of pages not found");
        }else {
            for(Book b:books_by_pages){
                System.out.println(b.getBookData());
            }
        }
    }
}
