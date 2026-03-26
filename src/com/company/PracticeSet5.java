package com.company;
import java.util.Scanner;

public class PracticeSet5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1
//        int n = 4;
//        for (int i=n; i>0; i--) {
//            for (int j=0; j<i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//        System.out.println("---------------------------");
//        int m = 1;
//        for (int i=m; i<5; i++) {
//            for (int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        // Question 2
//        System.out.println("Enter value of n ");
//        int n = sc.nextInt();
//        int sum = 0;
//        int i = 0;
//        while (i<n) {
//            sum = sum + (2*i);
//            i++;
//        }
//        System.out.println(sum);

        // Question 3
//        System.out.println("Enter a number");
//        int n = sc.nextInt();
//        System.out.println("Multiplication table of " + n + " is showing bellow ");
//        for (int i=1; i<=10; i++) {
//            System.out.printf("%d X %d = %d\n",n,i,i*n);
//        }

        // Question 4
//        int n = 10;
//        System.out.println("Multiplication table of " + n + " is showing bellow ");
//        for (int i=10; i>=1; i--) {
//            System.out.printf("%d X %d = %d\n",n,i,i*n);
//        }

        // Question 5
//        System.out.println("Enter a number ");
//        int n = sc.nextInt();
//        int fact = 1;
//        for (int i=1; i<=n; i++) {
//            fact = fact * i;
//        }
//        System.out.println("Factorial of " + n + " is= " + fact);

        // Question 9
        int n = 8;
        int sum = 0;
        System.out.println("Multiplication table of " + n + " is showing bellow ");
        for (int i=1; i<=10; i++) {
            sum += i*n;
        }
        System.out.println(sum);
    }
}
