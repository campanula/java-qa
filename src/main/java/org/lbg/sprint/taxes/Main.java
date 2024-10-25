package org.lbg.sprint.taxes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Taxes taxes = new Taxes();

        System.out.println("Please provide your salary as a number");
        double input = taxes.userInput(sc);
        double taxRate = taxes.calculateTaxRate(input);
        double taxAmnt = taxes.calculateTaxAmnt(input, taxRate);
        double remainingSalary = taxes.calculateRemaining(input, taxAmnt);

        System.out.println("Your tax rate is " + taxRate +"%.\n" +
                "The amount you will pay in tax is " + taxAmnt + ".\n" +
                "Your salary after tax will be £" + remainingSalary +
                ". Thank you for your government donation! :D");
        sc.close();

    }

}
