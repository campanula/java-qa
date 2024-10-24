package org.lbg.salesapp;

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

        System.out.println(this.itemCostInput);
        System.out.println(this.totalCost);

    }
}
