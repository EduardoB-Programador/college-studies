package model;

public class Account {

    private String holder, agency, accountNum;
    private double balance;

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public String getAgency() {
        return agency;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public Account() {
        super();
    }

    public Account(String holder, String agency, String accountNum, double balance) {

        super();
        this.holder = holder;
        this.agency = agency;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public double calculateBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "----------------------------------------" +
                "\nHolder's name: " + holder +
                "\nAgency: " + agency +
                "\nAccount Number: " + accountNum +
                "\nBalance: " + balance;
    }

}
