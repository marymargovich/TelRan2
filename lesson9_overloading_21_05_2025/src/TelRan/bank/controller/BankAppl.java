package TelRan.bank.controller;

import TelRan.bank.model.BankAccount;

public class BankAppl {
    public static void main(String[] args) {
        BankAccount[] bankAccounts = new BankAccount[4];
        System.out.println(bankAccounts[3]);
        bankAccounts[0] = new BankAccount(1000, " John", 1000);
        System.out.println(bankAccounts[0].deposit(500));
        System.out.println(bankAccounts[0].getBalance());
        System.out.println(bankAccounts[0].withdraw(200));
        bankAccounts[0].display();
        bankAccounts[1] = new BankAccount(200, "Peter", 5000);
        bankAccounts[2] = new BankAccount(3000, "Mary", 10000, "Bank#1", "Branch#1");
        bankAccounts[3] = new BankAccount(3000, "Mary", "Bank#1", "Branch#1");
        bankAccounts [3].display();
        bankAccounts[0].display("Mr. ");
        System.out.println("____________________________");
        printBank(bankAccounts);
        double total = totalBalance(bankAccounts);
        System.out.println("total Balance ="+ total);


        System.out.println("=============wrapper");
        int num = Integer.parseInt("100500");
        System.out.println(num);







    }

    private static void printBank(BankAccount[] bankAccounts) {
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount != null) {
                bankAccount.display();
            }
        }
    }

    public static double totalBalance(BankAccount[]acc){
        double res = 0;
        for( BankAccount bankAccount: acc){
            res += bankAccount.getAccount();
        }
        return  res;
    }

}
