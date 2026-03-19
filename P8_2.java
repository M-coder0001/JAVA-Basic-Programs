package com.Atmiya;

public class P8_2 {
    static int staticVariable = 10;

    static {
        System.out.println("Inside static block. Initializing staticVariable to 20.");
    }

    static void staticMethod() {
        System.out.println("Inside main method.");
        System.out.println("Value of staticVariable: " + staticVariable);
    }

    static void main(String[] args) {
        System.out.println("Inside main method.");

        System.out.println("Initializing value of staticVariable before static block execution: " + P8_2.staticVariable);

        P8_2.staticMethod();
    }
}
