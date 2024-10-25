package org.lbg.salesapp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MeShop s = new MeShop();

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> itemCostInput = new ArrayList<>();
        String instr;

        double vatAmnt = 0;

        while (true) {

            // checks if user wants to quit
            instr = s.getUserInstructionInput(sc);
            if (instr != null) {
                if (instr.equals("QUIT")) {
                    System.out.println("Quitting");
                    sc.close();
                    System.exit(0);
                }
            }



            // Get Item Costs
            itemCostInput = s.getItemCostInput(sc, itemCostInput);

            // calc total, then vat, then total with vat
            double itemCost = s.calculateTotalCost(itemCostInput);
            
            if (vatAmnt == 0){
                vatAmnt = s.calculateVAT(itemCost, s.vatInput);
            }
            
            double totalWithVat = s.calculateTotalWithVatAndQuantity(itemCostInput, itemCost, vatAmnt );

            System.out.println("The total price without VAT is " + itemCost + "\n" +
                    "The VAT amount is " + vatAmnt + "\n" +
                    "The total price including VAT is " + totalWithVat);

            // finish current loop
            System.out.println("Would you like to continue?");

        }
    }

}
