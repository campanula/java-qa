package org.lbg.c4.bankacc;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(15000);
        System.out.println(bankAccount.getBalance());
    }
}
