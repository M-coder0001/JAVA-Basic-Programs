package com.Atmiya;

public class P1_3 {
    static void main(String[] args) {
        int a = 20;
        int b = 10;
        int temp;

        System.out.println("1. Before swapping");
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);

        temp = a;
        a= b;
        b= temp;
        System.out.println("--------------------");
        System.out.println("2. After swapping");
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
    }
}
