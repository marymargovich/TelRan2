package TelRan.book2.controller;

public class KidsBook extends Book {
    private int age;


    public KidsBook(String author, String title, long isbn, int year, int age) {
        super(author, title, isbn,year);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String cyan = "\u001B[36m";
        String reset = "\u001B[0m";
        return super.toString()
                + cyan +" Age  "+ reset + age;
    }
}

