package org.lbg.sprint.uniquesum;

import java.util.*;

public class Sum {

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
        // remove duplicate numbers by converting to set
        Set<Integer> set = new HashSet<>(values);
        int total = 0;

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            Integer cur = it.next();
            total += cur;
        }
        return total;
    }
}
