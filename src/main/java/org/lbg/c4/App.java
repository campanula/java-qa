package org.lbg.c4;


import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        int counter = 0;
        char val;

        try {
            while ((val = (char) System.in.read()) != -1) {
                counter++;
                System.out.println("count" + counter);
                System.out.println("chars" + val);
                System.out.println("char entered" + Integer.toHexString(val));
            }
        } catch (IOException e) {
            System.out.println(e);

        }


    }
}
