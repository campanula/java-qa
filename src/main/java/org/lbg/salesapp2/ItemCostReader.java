package org.lbg.salesapp2;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemCostReader extends InputReader implements IReader {
    public ItemCostReader(ICustomPrompt icp) {
        super(icp);
    }

    @Override
    public String getInput(InputStream is) {
        Scanner scanner = new Scanner(is);

        iCustomPrompt.prompt("Please enter all the item prices you want included in the total cost.\n" +
                "Type DONE when you wish to finish.");

        ArrayList<String> prices = new ArrayList<>();
        String input;

        while (true) {
            input = scanner.nextLine();

            if ("DONE".equalsIgnoreCase(input) || input.equalsIgnoreCase("QUIT")) {
                break;
            }

            if (checkIfInt(input)) {
                prices.add(input);
            }
        }

        return String.join("&", prices);
    }

    public boolean checkIfInt(String input) {
        int inputAsNum;
        try {
            inputAsNum = Integer.parseInt(input); //Check string includes number

            if (inputAsNum <= 0) {
                iCustomPrompt.prompt("Not a valid positive value, please enter a positive number.");
                return false;
            }

        } catch (NumberFormatException e) {
            iCustomPrompt.prompt("Invalid input. Please enter a valid integer.");
            return false;
        }

        return true;
    }

    public List<String> getPricesAsList(InputStream is) {
        String input = getInput(is);
        return List.of(input.split("&"));
    }

    public int getTtemQuantity(String input) {
        String[] words = input.split("&");
        return words.length;
    }
}