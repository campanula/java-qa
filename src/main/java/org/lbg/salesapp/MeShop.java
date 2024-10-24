package org.lbg.salesapp;

import java.util.ArrayList;
import java.util.Scanner;

public class MeShop {

    public int getVatInput(Scanner sc) {
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

    public ArrayList getItemCostInput(Scanner sc, ArrayList<Integer> list) {
        System.out.println("Please enter all the item prices you want included in the total cost.");
        System.out.println("Type DONE when you wish to finish");


        while (sc.hasNextLine()) {
            String input = sc.nextLine().toUpperCase();

            if (input.equals("DONE")) {
                break;
            }

            try {
                int inputAsNum = Integer.parseInt(input);

                if (inputAsNum <= 0) {
                    System.out.println("Not a valid positive value");
                    continue;
                }

                list.add(inputAsNum);
                System.out.println(list);

            } catch (NumberFormatException e) {
                //System.out.println("Enter a number or DONE >:(");
            }
        }
        return list;
    }

    public String getUserInstructionInput(Scanner sc) {
        System.out.println("Type QUIT to quit, or press enter to enter more prices");

        String data = null;

        while (sc.hasNextLine()) {
            String nl = sc.nextLine();

            if (!(nl.isEmpty())) {
                String input = nl.toUpperCase();

                if (input.equals("QUIT")) {
                    data = "QUIT";
                    break;
                }
            } else {
                System.out.println("Enter key detected.");
                data = "ENTER";
                break;
            }

        }

        return data;
    }

    public static double calculateTotalCost(ArrayList<Integer> itemCostInput) {
        int totalCost = 0;

        for (int i = 0; i < itemCostInput.size(); i++) {
            totalCost = totalCost + itemCostInput.get(i);
        }

        return totalCost;
    }


    public static double calculateVAT(double totalCost, double vatInput) {
        double vatAmnt = (totalCost * vatInput);
        return vatAmnt / 100;
    }

    public static double calculateTotalWithVatAndQuantity(ArrayList<Integer> itemCostInput, double totalCost, double vatAmnt) {
        Item item = new Item(itemCostInput, totalCost, vatAmnt);
        double totalIncVat = ((item.totalCost + item.vatAmnt) * item.itemCostInput.size());
        return totalIncVat;
    }
}
