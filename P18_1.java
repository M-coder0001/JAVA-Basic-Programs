package com.Atmiya;

public class P18_1 {
    static void main(String[] args) {
        try {
            int a = 10 / 2;
            System.out.println("Outer try block");

            try {
                int b = 10 / 0;
                System.out.println(b);
            }
            catch (ArithmeticException e) {
                System.out.println("Arithmatic exeption");
            }
            System.out.println("Outer Try ended");
        }
        catch (Exception e) {
            System.out.println("Outer Catch");
        }
    }
}
