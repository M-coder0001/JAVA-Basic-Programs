package com.Atmiya;

public class P19_1 {
    static void checkAge (int age) throws  ArithmeticException {
        if (age <19) {
            throw new ArithmeticException("Age is less than 18");
        } else {
            System.out.println("Welcome! You are eligible");
        }
    }
    static void main(String[] args) {
        try {
            checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
