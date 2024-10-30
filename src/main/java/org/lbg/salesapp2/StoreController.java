package org.lbg.salesapp2;

import java.util.ArrayList;

public class StoreController {
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
        double totalIncVat = ((totalCost + vatAmnt) * itemCostInput.size());
        return totalIncVat;
    }


}
