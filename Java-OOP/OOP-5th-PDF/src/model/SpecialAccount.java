package model;

public class SpecialAccount extends BankAccount {

    double creditLimit;

    public SpecialAccount(String holder, int agencyNumber, int accountNumber, double balance, double creditLimit) {
        super(holder, agencyNumber, accountNumber, balance);
        this.creditLimit = creditLimit;
    }

    public SpecialAccount() {
        super();
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCredit Limit: " + creditLimit;
    }

    @Override
    public String withdraw(double value) {

        double tempBalance = getBalance();

        if (value <= tempBalance + creditLimit) {

            tempBalance -= value;
            setBalance(tempBalance);

            return "You drew: " + value +
                    "\nYour current balance is now: " + tempBalance;
        } else {
            return "Not enough balance, your balance is: " + tempBalance;
        }

    }
}
