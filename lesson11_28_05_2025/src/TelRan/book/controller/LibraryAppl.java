package TelRan.book.controller;

import TelRan.book.dao.Library;
import TelRan.book.model.Book;

public class LibraryAppl {
    public static void main(String[] args) {

        Library library = new Library(8);
        System.out.println(library.addBook(new Book("George Orwell", "1984", 9780451524935L, 1949)));
        System.out.println(library.addBook(new Book("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", 9780590353427L, 1997)));
        System.out.println(library.addBook(new Book("J.R.R. Tolkien", "The Hobbit", 9780547928227L, 1937)));
        System.out.println(library.addBook(new Book("Harper Lee", "To Kill a Mockingbird", 9780061120084L, 1960)));
        System.out.println(library.addBook(new Book("F. Scott Fitzgerald", "The Great Gatsby", 9780743273565L, 1925)));
        System.out.println(library.addBook(new Book("Jane Austen", "Pride and Prejudice", 9780141439518L, 1813)));
        System.out.println(library.addBook(new Book("Leo Tolstoy", "War and Peace", 9780199232765L, 1869)));
        System.out.println(library.addBook(new Book("Markus Zusak", "The Book Thief", 9780375842207L, 2005)));

        System.out.println("____________Library________________");
        library.printBooks();
        System.out.println("______________Find book____________________");
        System.out.println(library.findByTitle("War and Peace"));
        System.out.println("____________Remove the book_________________");
        System.out.println(library.removeBookByTitle("War and Peace"));
        library.printBooks();
        System.out.println("______________UPDATE __________________");
        System.out.println(library.updateBook("unknown", "Pushkin A.S"));



    }
}
