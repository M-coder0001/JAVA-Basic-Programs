package com.company;
import java.util.Scanner;

public class CalculatePER {
     static void main() {
        Scanner sc = new Scanner(System.in);

        int total = 500;
        System.out.println("Total marks is: " + total);

        System.out.print("English: ");
        float en = sc.nextFloat();

        System.out.print("Hindi: ");
         float hi = sc.nextFloat();

        System.out.print("Maths: ");
         float mh = sc.nextFloat();

        System.out.print("Science: ");
         float sci = sc.nextFloat();

        System.out.print("General Knowledge: ");
         float gk = sc.nextFloat();

         float obtain = en + hi + mh + sci + gk ;
        System.out.println("Total Obtain Marks is: " + obtain);

        float PER = (obtain * 100.0f) / total;
        System.out.println("PERCENTAGE IS: " + PER + "%");
    }
}
