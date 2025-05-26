package TelRan.book2.model;

public class ComicsBook extends Book {
    private String illustrator;
    private boolean hasBonusContent;

    public ComicsBook(){};



    public ComicsBook(String author, String title,
                      long isbn, int year,
                      String illustrator, boolean hasBonusContent) {
        super(author, title, isbn, year);
        this.hasBonusContent = hasBonusContent;
        this.illustrator = illustrator;

    }

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public boolean isHasBonusContent() {
        return hasBonusContent;
    }

    public void setHasBonusContent(boolean hasBonusContent) {
        this.hasBonusContent = hasBonusContent;
    }

    @Override
    public String toString(){
        String magenta = "\u001B[35m";
        String reset = "\u001B[0m";
        return super.toString()
                + magenta+ " Illustrator  "+ reset + illustrator
                + magenta+ " has bonus content "+ reset + hasBonusContent;
    }
}

