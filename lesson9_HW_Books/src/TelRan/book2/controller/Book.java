package TelRan.book2.controller;

public class Book {
    private String author;
    private String title;
    private long isbn;
    private int year;

    public  Book(){};

    public Book(String author, String title, long isbn, int year) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.year = year;
    }

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }





    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null)
            this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null)
            this.title = title;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        String str = String.valueOf(isbn);

        if (str.length() == 13) {
            this.isbn = isbn;
        } else {
            System.out.println("Wrong amount of digits!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0)
            this.year = year;
    }


    @Override
    public String toString() {
        String green = "\u001B[32m";
        String reset = "\u001B[0m";
        String result = green + "Author: " + reset + author  +
                green + " Title: " + reset + title   +
                green + " Year: " + reset + year;
        if (isbn != 0) {
            result += green + " ISBN " + reset + isbn ;
        }
        return result;
    }
}

