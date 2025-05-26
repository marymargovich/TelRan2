package TelRan.bank.model;

public class BankAccount {

    private long account;
    private String owner;
    private double balance;
    private String bank;
    private String branch;


    public BankAccount(long account, String owner,
                       double balance, String bank,
                       String branch) {
        this.account = account;
        this.owner = owner;
        this.balance = balance;
        this.bank = bank;
        this.branch = branch;
    }

    public BankAccount(long account, String owner,
                       double balance) {
        this.account = account;
        this.owner = owner;
        this.balance = balance;
        this.bank = "Bank#1";
        this.branch = "Branch#1";
    }

    public BankAccount(long account, String owner, String bank, String branch) {
        this.account = account;
        this.owner = owner;
        this.bank = bank;
        this.branch = branch;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }




    public boolean deposit( double sum){
        boolean res = false;
        if( sum>=0){
            balance += sum;
            res = true;
        }
        return res;
    }


    public boolean withdraw ( double sum) {
        if ( sum >= 0 && sum <= balance ){
            balance -= sum;
            return true;
        }
        return false;
    }





    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void display(){
        System.out.println("Account: "+ account + " Owner: "+ owner + " Balance: "+ balance );
    }


    public void display(String greeting){
        System.out.println("Account: "+ account + " Owner: "+ greeting + owner + " Balance: "+ balance );
    }



}
