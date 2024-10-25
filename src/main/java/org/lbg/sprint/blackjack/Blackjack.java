package org.lbg.sprint.blackjack;

import java.util.*;

public class Blackjack {

    public int userInput(Scanner sc){
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

    public int sum(ArrayList<Integer> values){
        int maxNum = 21;
        int biggestNum = 0;

        // loop for biggest num less than 22
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) <= maxNum && values.get(i) > biggestNum){
                biggestNum = values.get(i);
            }
        }
        return biggestNum;
    }
}
