package TelRan.bookHW.dao;

import TelRan.bookHW.model.BookHW;

public class LibraryHW {
    BookHW [] books;
    int size;


    public LibraryHW (int capacity){
        books = new BookHW[ capacity];
    }

    public boolean addBook (BookHW bookHW){
        if (books.length == size){
            return false;
        }
        books[size] = bookHW;
        size++;
        return true;
    }




    public void  printBooks(){
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);

        }
    }

    public int findIndexOfBookByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return i;
            }
        }
        return -1;
    }



    public void printBookFromYear(int fromYear) {
        for (int i = 0; i < size; i++) {
            if (books[i].getYear() >= fromYear) {
                System.out.println(books[i]);
            }
        }
    }

    public void printBookFromToYear(int fromYear, int toYear) {
        for (int i = 0; i < size; i++) {
            int year = books[i].getYear();
            if (year >= fromYear && year <= toYear) {
                System.out.println(books[i]);
            }
        }

    }



    public int getSize() {
        return size;
    }
}
