package org.lbg.salesapp;

import java.util.ArrayList;
import java.util.Scanner;

public class MeShop {
    int vatInput = 0;

    public void getConstantScanInput(Scanner sc) {
        String input = null;
        String nl;
        String data = null;

        while (sc.hasNextLine()) {
            nl = sc.nextLine();
            input = nl.trim().toUpperCase();

            if (input.equals("QUIT")) {
                data = "QUIT";
                break;
            }

            //get vat rate
            if (vatInput == 0) {
                System.out.println("Please enter the VAT rate first.");
                vatInput = getVatInput(sc);
            }

        }
    }

    public int getVatInput(Scanner sc) {
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

    public ArrayList<Integer> getItemCostInput(Scanner sc, ArrayList<Integer> list) {
        System.out.println("Please enter all the item prices you want included in the total cost.\n" +
                "Type DONE when you wish to finish.");


        while (sc.hasNextLine()) {
            String input = sc.nextLine().toUpperCase();

            if (input.equals("DONE")) {
                break;
            }

            try {
                int inputAsNum = Integer.parseInt(input);

                if (inputAsNum <= 0) {
                    System.out.println("Not a valid positive value, please enter a positive number.");
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
        return (totalCost * vatInput) / 100;
    }

    public static double calculateTotalWithVatAndQuantity(ArrayList<Integer> itemCostInput, double totalCost, double vatAmnt) {
        // removing request for object bc i dont want it
        //Item item = new Item(itemCostInput, totalCost, vatAmnt);
        //double totalIncVat = ((item.totalCost + item.vatAmnt) * item.itemCostInput.size());
        return (totalCost + vatAmnt) * itemCostInput.size();
    }
}
