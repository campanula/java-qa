package org.lbg.c4.bankacc;

public class Calculator {

    private double itsBalance;

    public Calculator(double openingBalance) {
        itsBalance = openingBalance;
    }

    public double getBalance() {
        return itsBalance;
    }

    public void addition(double amt) {
        if (amt > 0)
            itsBalance += amt;
    }

    public void subtraction(double amt) {
        if (itsBalance - amt > 0 && amt > 0)
            itsBalance -= amt;
    }

    public void multiplication(double amt) {
        if (amt > 0)
            itsBalance *= amt;
    }

    public void division(double amt) {
        if (amt > 0)
            itsBalance /= amt;
    }
}
