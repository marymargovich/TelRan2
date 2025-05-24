package TelRan.book2.model;

import TelRan.book2.controller.*;

public class BookShopAppl {
    public static void main(String[] args) {

        Book b1 = new Book("Tolkien J.R.R.",
                "The Fall of Gondolin",
                9780008302757L,
                2018);
        Magazine m1 = new Magazine("Anna Wintour",
                "Vogue",
                2023,
                "Issue 11 (November)",
                "Fashion and Lifestyle");
        Newspaper np1 = new Newspaper("Katharine Viner",               // author (Editor-in-Chief)
                "The Guardian",
                2025,
                "2025-05-24",
                "Global Leaders Discuss Climate Change" );
        KidsBook k1 = new KidsBook("Harper Lee",
                "To Kill a Mockingbird",
                9780060935467L,
                2006,
                12);

        ComicsBook cb1 = new ComicsBook("Stan Lee",
                "Spider-Man: Homecoming",
                9781302909820L,
                2017,
                "Steve Ditko",
                true);

        System.out.println(b1);
        System.out.println(m1);
        System.out.println(np1);
        System.out.println(k1);






    }

}
