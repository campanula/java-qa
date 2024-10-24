package org.lbg.c4;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        double result  = sum(4.5,5);
        System.out.println(result);
        int y = 44;
        MyInteger mi = new MyInteger();


        fooBar(mi);
        System.out.println(mi.data);

    }

    public static double sum(double x, int y){

        return x+y;
    }

    public static void  fooBar (MyInteger myInt){
        myInt.data++;
    }
}
