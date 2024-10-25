package org.lbg.sprint.uniquesum;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sum s = new Sum();
        ArrayList<Integer> values = new ArrayList<>();

        System.out.println("Please give three integer values");
        while (values.size() < 3){
            values.add(s.userInput(sc));
        }
        sc.close();

        int totalSum = s.sum(values);
        System.out.println("The total of the three integers, not including any duplicates is " + totalSum);

    }

}
