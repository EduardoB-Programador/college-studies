package model;

public class SavingsAccount extends BankAccount {

    private int interestDay;

    public SavingsAccount(String holder, int agencyNumber, int accountNumber, double balance, int interestDay) {
        super(holder, agencyNumber, accountNumber, balance);
        this.interestDay = interestDay;
    }

    public SavingsAccount() {
        super();
    }

    public void setInterestDay(int interestDay) {
        this.interestDay = interestDay;
    }

    public int getInterestDay() {
        return interestDay;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nInterest Day: " + interestDay;
    }

    public void calculateNewBalance(double percentage) {
        percentage /= 100;

        double finalValue = getBalance() + (getBalance() * percentage);
        setBalance(finalValue);

        System.out.println("------------------------------------------" +
                "\nYour balance was updated, your current balance is now: " + getBalance());
    }
}
