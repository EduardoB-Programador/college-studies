package controller;

import model.Account;
import model.SpecialAccount;

public class Atividade {
    public static void main(String[] args) {

        Account acc = new Account("Mathew", "0127", "98706501", 1200);

        System.out.println(acc.toString() + "\nTotal balance: " + acc.calculateBalance());

        SpecialAccount speAcc = new SpecialAccount("Joe", "0216", "81260771", 2600, 4000);

        System.out.println(speAcc.toString());

    }
}
