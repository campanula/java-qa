package org.lbg.c4;

import java.security.PublicKey;

public class Lambdas {
    public static void main(String[] args) {
        Lambdas ll = new Lambdas();
        ll.execute();
    }

    class ABC {
        /*     public ABC(){}
             public ABC(int x){}*/
        public void printMe() {
            System.out.println("Hello from ABC::printMe()");
        }
    }

    class XYZ extends ABC {
        @Override
        public void printMe() {
            System.out.println("Hello from XYZ::printMe()");
        }

    }

@FunctionalInterface
    interface Callback {
        void execute();
    }

    public void execute() {
        XYZ xyz = new XYZ();
        xyz.printMe();

        ABC abc = new ABC() {
            @Override
            public void printMe() {
                System.out.println("Hello from Child::printMe()");
                super.printMe();
            }
        };
        abc.printMe();
        Callback cc = new Callback() {
            @Override
            public void execute() {
                System.out.println("hi");
            }
        };
        cc.execute();

        Callback cc2 = () -> {
            System.out.println("hi2");
        };

        cc2.execute();
    }
}
 
 
 