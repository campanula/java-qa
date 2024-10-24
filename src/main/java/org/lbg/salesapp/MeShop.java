package org.lbg.salesapp;

import java.util.Scanner;

public class MeShop {

    public int scan(Scanner sc) {

        int input;
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Not a valid positive value");
                sc.next();
            }
            input = sc.nextInt();

        } while (input <= 0);

        return input;

    }

    public static double calculate(double itemCostInput, double vatInput){
        double res = (itemCostInput * vatInput) / 100;
        return res;
    }
}
