package TelRan.bookHW.controller;

import TelRan.bookHW.dao.LibraryHW;
import TelRan.bookHW.model.BookHW;

public class LibraryApplHW {
    public static void main(String[] args) {

        LibraryHW libraryHW = new LibraryHW(10);
        System.out.println(libraryHW.addBook(new BookHW("George Orwell", "1984", 9780451524935L, 1949)));
        System.out.println(libraryHW.addBook(new BookHW("Aldous Huxley", "Brave New World", 9780060850524L, 1932)));
        System.out.println(libraryHW.addBook(new BookHW("Ray Bradbury", "Fahrenheit 451", 9781451673319L, 1953)));
        System.out.println(libraryHW.addBook(new BookHW("Harper Lee", "To Kill a Mockingbird", 9780061120084L, 1960)));
        System.out.println(libraryHW.addBook(new BookHW("J.D. Salinger", "The Catcher in the Rye", 9780316769488L, 1951)));
        System.out.println(libraryHW.addBook(new BookHW("Ernest Hemingway", "The Old Man and the Sea", 9780684801223L, 1952)));
        System.out.println(libraryHW.addBook(new BookHW("John Steinbeck", "Of Mice and Men", 9780140177398L, 1937)));
        System.out.println(libraryHW.addBook(new BookHW("F. Scott Fitzgerald", "The Great Gatsby", 9780743273565L, 1925)));
        System.out.println(libraryHW.addBook(new BookHW("Jane Austen", "Pride and Prejudice", 9780141439518L, 1813)));
        System.out.println(libraryHW.addBook(new BookHW("Leo Tolstoy", "Anna Karenina", 9780143035008L, 1877)));


        System.out.println("____________Library________________");
        libraryHW.printBooks();
        System.out.println("_________Print from year______");
        libraryHW.printBookFromYear(1950);
        System.out.println("________Print from year TO year");
        libraryHW.printBookFromToYear(1800, 1900);
        System.out.println("__________Print INDEX by title______");
        int index = libraryHW.findIndexOfBookByTitle("The Great Gatsby");
        System.out.println("Index: " + index);









    }
}
