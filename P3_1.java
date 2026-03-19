package com.Atmiya;
import java.util.Scanner;

public class P3_1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of student:");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade is: A️");
        }
        else if (marks >= 80) {
            System.out.println("Grade is: B️");
        }
        else if (marks >= 60) {
            System.out.println("Grade is: C");
        }
        else if (marks >= 40) {
            System.out.println("Grade is: D");
        }
        else {
            System.out.println("Grade is: E");
        }
    }
}
