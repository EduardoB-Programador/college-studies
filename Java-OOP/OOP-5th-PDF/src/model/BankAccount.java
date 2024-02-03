package model;

public class BankAccount {

    private String holder;
    private int agencyNumber, accountNumber;
    private double balance;

    public BankAccount(String holder, int agencyNumber, int accountNumber, double balance) {

        super();
        this.holder = holder;
        this.agencyNumber = agencyNumber;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount() {
        super();
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setAgencyNumber(int agencyNumber) {
        this.agencyNumber = agencyNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public int getAgencyNumber() {
        return agencyNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "------------------------------------------" +
                "\nHolder's name: " + holder +
                "\nAgency number: " + agencyNumber +
                "\nAccount number: " + accountNumber +
                "\nBalance: " + balance;
    }

    public void deposit(double value) {
        balance += value;
        System.out.println("------------------------------------------" +
                "\nThe deposit was made, current balance is now: " + balance);
    }

    public String withdraw(double value) {

        if (value <= balance) {
            balance -= value;
            return "------------------------------------------" +
                    "\nYou drew: " + value +
                    "\nYour current balance is now: " + balance;
        } else {
            return "------------------------------------------" +
                    "\nNot enough balance, your balance is: " + balance;
        }

    }
}
