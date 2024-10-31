package org.lbg.salesapp2;

import java.util.ArrayList;

// a fun, exciting object
public class Item {
    ArrayList<Integer> itemCostInput;
    double totalCost;
    double vatAmnt;

    public Item(ArrayList<Integer> itemCostInput, double totalCost, double vatAmnt) {
        this.itemCostInput = itemCostInput;
        this.totalCost = totalCost;
        this.vatAmnt = vatAmnt;

        //StoreController storeController = new StoreController();
        //vatInputReader.getValidatedVatRate();
        //storeController.calculateVAT();

        System.out.println(this.itemCostInput);
        System.out.println(this.totalCost);

    }

    public double getTotalCost()
    {
        return totalCost;
    }

}
