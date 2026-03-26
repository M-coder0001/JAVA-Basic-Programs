package com.company;
import java.util.Scanner;
//To take input from the keyboard we need to import the Scanner Class that's why we import this

public class UserInput {
    static void main() {
        System.out.println("Enter numbers for sum");
        Scanner sc = new Scanner(System.in); // object oof scanner
        System.out.println("Enter number 1");
        int a = sc.nextInt();
       System.out.println("Enter number 2");
       int b = sc.nextInt();
       int sum = a + b;
       System.out.println("Sum of these two number is " + sum);

        System.out.println("Tacking input from the user");

//        sc.hasNextInt is used for comparing the input
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

//only sc.next() is used for printing only one word
        String str = sc.next();
        System.out.println(str);

//sc.nextLine() is used for printing whole string
        String str1 = sc.nextLine();
        System.out.print(str1);
    }
}
