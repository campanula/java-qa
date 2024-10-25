package org.lbg.sprint.fizzbuzz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FizzBuzz fb = new FizzBuzz();

        System.out.println("Please provide a maximum value to fizzbuzz up to.\n" +
                "It will output fizz for all multiples of three, buzz for all multiples of five, fizzbuzz for numbers which are both multiples of three and five, amd just the number for meeting none of these conditions.");
        int input = fb.userInput(sc);
        fb.fizzBuzz(input);
        sc.close();

    }

}
