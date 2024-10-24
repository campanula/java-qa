package org.lbg.salesapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MeShop s = new MeShop();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the item cost first.");
        int itemCostInput = s.scan(sc);

        System.out.println("Please enter the VAT rate.");
        int vatInput = s.scan(sc);

        double result = s.calculate(itemCostInput, vatInput);
        System.out.println("The VAT is " + result);
    }



}
