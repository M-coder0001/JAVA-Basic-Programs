package com.Atmiya;
import java.util.Scanner;

public class P3_3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        do {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        } while (num != 0);

        if (original == reverse) {
            System.out.println(original + " is a Palindromic Number");
        } else {
            System.out.println(original + " is NOT a Palindromic Number");
        }
    }
}