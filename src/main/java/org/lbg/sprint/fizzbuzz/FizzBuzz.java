package org.lbg.sprint.fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {

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

    public void fizzBuzz(int maxValue){
        for (int i = 0; i < maxValue + 1; i++) {
            System.out.println("The current number is " + i);

            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz yay yippee :D");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
