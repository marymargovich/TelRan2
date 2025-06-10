package TelRan.book.model;

public class Book {
    private String author;
    private String title;
    private long isbn;
    private int year;


    public Book(String author, String title, long isbn, int year) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.year = year;
    }


    public Book(long isbn, String title, int year) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;

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


    public void display() {
        System.out.println("\u001B[31m" + " Author: " + "\u001B[0m" + author + "\u001B[31m" + " Title: " + "\u001B[0m" + title + "\u001B[31m" + " ISBN: " + "\u001B[0m" + isbn + "\u001B[31m" + " Year: " + "\u001B[0m" + year);
    }

    @Override
    public String toString() {
        final String GREEN = "\u001B[32m";
        final String RESET = "\u001B[0m";

        return GREEN + "Book" + RESET +
                " " + GREEN + "author:" + RESET + " " + author +
                ", " + GREEN + "title:" + RESET + " " + title +
                ", " + GREEN + "isbn:" + RESET + " " + isbn +
                ", " + GREEN + "year:" + RESET + " " + year;
    }
}