package model;

public class SpecialAccount extends Account {
    private double creditLimit;

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public SpecialAccount() {

        super();
    }

    public SpecialAccount(String holder, String agency, String accountNum, double balance, double creditLimit) {

        super(holder, agency, accountNum, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public double calculateBalance() {
        double finalBalance = super.calculateBalance() + creditLimit;

        return finalBalance;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCredit limit: " + creditLimit +
                "\nTotal balance: " + calculateBalance();
    }
}
