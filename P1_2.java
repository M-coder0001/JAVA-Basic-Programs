package com.Atmiya;
import java.util.Scanner;

public class P1_2 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        int add=0;
        add = a+b;
        System.out.println("Addition of " + a + " and " + b + " is:" + add);
    }
}
