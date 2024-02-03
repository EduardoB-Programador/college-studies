package controller;

import model.BankAccount;
import model.SavingsAccount;
import model.SpecialAccount;

public class Atividade {
    public static void main(String[] args) {

        SavingsAccount savAcc1 = new SavingsAccount("Juan", 112, 512411, 500, 12);

        SpecialAccount speAcc1 = new SpecialAccount();

        speAcc1.setHolder("Luan");
        speAcc1.setAgencyNumber(89);
        speAcc1.setAccountNumber(122541);
        speAcc1.setBalance(800);
        speAcc1.setCreditLimit(1000);

        System.out.println(savAcc1.toString() + "\n" + speAcc1.toString());

        savAcc1.deposit(150);
        System.out.println(savAcc1.withdraw(1000));
        System.out.println(savAcc1.withdraw(250));

        savAcc1.calculateNewBalance(1.2);

        speAcc1.deposit(300);
        System.out.println(speAcc1.withdraw(2500));
        System.out.println(speAcc1.withdraw(1200));

        System.out.println(savAcc1.toString() + "\n" + speAcc1.toString());
    }
}
