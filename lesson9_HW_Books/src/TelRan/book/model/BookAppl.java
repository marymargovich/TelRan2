package TelRan.book.model;

import TelRan.book.controller.Book;

public class BookAppl {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        library[0] = new Book("Tolkien J.R.R.", "The Silmarillion", 9780008433949L, 2021);
        library[1] = new Book("Tolkien J.R.R.", "Beren and Lúthien", 9780008214197L, 2017);
        library[2] = new Book(9780008433949L, "The Fall of Gondolin", 2018);
        library[3] = new Book(9780008376123L, "The Fellowship of the Ring", 2020);
        library[4] = new Book(9780008376130L, "The Two Towers", 2020);



        System.out.println("__________All books in library_________");
        printLibrary(library);
        System.out.println("__________books from year_________");
        printLibrary(library, 2020);
        System.out.println("__________books from year _to Year_________");
        printLibrary(library,2015, 2018);


        // перегруженные методы -  3 шутки
        // print (book[])
        // print(book[], fromYear)
        // print(book[], fromYear, toYear)


    }

    private static void printLibrary(Book[] library) {
        for (Book book : library) {
            if (book != null) {
                book.display();
            }
        }
    }
    private static void printLibrary(Book[] library, int fromYear) {
        for (Book book : library) {
            if (book != null && book.getYear() >= fromYear) {
                book.display();
            }
        }
    }
    private static void printLibrary(Book[] library, int fromYear, int toYear) {
        for (Book book : library) {
            if (book != null && book.getYear() >= fromYear && book.getYear() <= toYear) {
                book.display();
            }
        }
    }



}
