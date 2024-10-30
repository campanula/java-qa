package org.lbg.salesapp2;

import java.io.InputStream;
import java.util.Scanner;

public class VatInputReader extends InputReader implements IReader {
    public VatInputReader(ICustomPrompt icp) {
        super(icp);
    }

    @Override
    public String getInput(InputStream is) {
        Scanner scanner = new Scanner(is);
        iCustomPrompt.prompt("Please enter the VAT rate first.");

        String input;
        while (true) {

            input = scanner.nextLine();

            if (input.equalsIgnoreCase("QUIT")) {
                break;
            }
            if (checkIfInt(input)) {
                break;
            }
        }
        return input;
    }

    // get vat rate as int if needed
    public int getValidatedVatRate(InputStream is) {
        String input = getInput(is);
        return Integer.parseInt(input);
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

}