package TelRan.book2.controller;

public class Magazine extends Book {
    private String issueNumber;
    private String category;
    private String issn;

    private Magazine(){};




    public Magazine(String author, String title, int year, String issueNumber, String category, String issn) {
        super(author, title, year);
        this.issueNumber = issueNumber;
        this.category = category;
        this.issn = issn;

    }
    public Magazine(String author, String title, int year, String issueNumber, String category) {
        super(author, title, year);
        this.issueNumber = issueNumber;
        this.category = category;
    }


    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        if( issn != null )
            this.issn = issn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setDate(String issueNumber) {
        if (issueNumber !=  null)
            this.issueNumber = issueNumber;
    }
    @Override
    public String toString(){
        String yellow = "\u001B[33m";
        String reset = "\u001B[0m";
        return super.toString()
                + yellow +" Issue Number "+ reset +issueNumber
                + yellow + " category "+ reset  + category
                + yellow + " ISSN " + reset + issn;
    }
}
