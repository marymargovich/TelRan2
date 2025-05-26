package TelRan.book2.model;

public class Newspaper extends Book {
    private String issueDate;
    private  String headline;

    public Newspaper(){};




    public Newspaper(String author, String title,
                     int year, String issueDate,
                     String headline) {
        super(author, title, year);
        this.headline = headline;
        this.issueDate = issueDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        if ( issueDate != null)
            this.issueDate = issueDate;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        if( headline != null)
            this.headline = headline;
    }
    @Override
    public String toString(){
        String yellow = "\u001B[33m";
        String reset = "\u001B[0m";
        return super.toString()
                + yellow+ " Issue Date "+ reset +issueDate
                + yellow+ " Headline "+ reset + headline;
    }
}
