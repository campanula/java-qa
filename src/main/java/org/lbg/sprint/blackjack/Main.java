package org.lbg.sprint.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Blackjack blackjack = new Blackjack();
        ArrayList<Integer> values = new ArrayList<>();

        System.out.println("Let's play Blackjack!\n" +
                "Please give two integer values");
        while (values.size() < 2){
            values.add(blackjack.userInput(sc));
        }
        sc.close();

        int biggestNum = blackjack.sum(values);
        System.out.println("The winning number is " + biggestNum);

    }

}
