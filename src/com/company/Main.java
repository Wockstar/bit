package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    ScientificBook a = new ScientificBook("Galileo","RU",200,1500,"Russia");
    ScientificBook b = new ScientificBook("Vseznayka","RU",100,1200,"Russia");
    LiteratureBook c = new LiteratureBook("TomSawyer","KZ",900,"Mark Twen","1876");
    LiteratureBook d = new LiteratureBook("Alisa","RU",1000,"Charles","1865");

    Library lib = new Library("Nazarbayev Library","Nur-Sultan","Kazakhstan");
    lib.addBook(a);
    lib.addBook(b);
    lib.addBook(c);
    lib.addBook(d);
    lib.printLibrary();
        System.out.println("PRESS [1] TO SEARCH BOOK BY NAME");
        System.out.println("PRESS [2] TO SEARCH BOOK BY CODE");
        System.out.println("PRESS [3] TO SEARCH BOOK BY PAGES AMOUNT");

        Scanner sc = new Scanner (System.in);

        String input = sc.nextLine();
        if (input.equals("1")){
            System.out.println("Insert name of the book: ");
            String name = sc.nextLine();
            System.out.println(" ");
            System.out.println(lib.searchBookByName(name));
        }
        if (input.equals("2")){
            System.out.println("Insert code of the book: ");
            String code = sc.nextLine();
            System.out.println(" ");
            lib.searchBookByCode(code);
        }
        if (input.equals("3")){
            System.out.println("Insert minimum amount of pages of the book: ");
            int min_page=sc.nextInt();
            System.out.println("Insert maximum amount of pages of the book: ");
            int max_page=sc.nextInt();
            System.out.println(" ");
            lib.searchBookByPages(min_page,max_page);
        }
    }

}
