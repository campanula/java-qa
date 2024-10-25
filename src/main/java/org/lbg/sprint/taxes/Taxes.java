package org.lbg.sprint.taxes;

import java.util.Scanner;

public class Taxes {

    public long userInput(Scanner sc){
        int input;
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Not a valid positive value, please enter a positive number.");
                sc.next();
            }
            input = sc.nextInt();

        } while (input <= 0);

        return input;

    }

    public double calculateTaxRate(double salary){
        if (salary <= 14999) return 0;
        if (salary >= 15000 && salary <= 19999) return 10;
        if (salary >= 20000 && salary <= 29999) return 15;
        if (salary >= 30000 && salary <= 44999) return 20;
        if (salary >= 45000) return 25;
        return 0; //return default
    }

    public double calculateTaxAmnt(double salary, double rate){
        double taxPercentage = rate / 100;
        double taxAmnt = salary * taxPercentage;

        return taxAmnt;
    }

    public double calculateRemaining(double salary, double taxAmnt){
        double remainingSalary = salary - taxAmnt;
        return remainingSalary;
    }
}
