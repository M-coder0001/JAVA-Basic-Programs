package com.company;
import java.util.Scanner;

public class PracticeSet4 {
    static void main() {
        // Question 1
//        int a = 10;
//        if (a == 11) {
//            System.out.println("I am 11");
//        } else {
//            System.out.println("I am not 11");
//        }

        // Question 2
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter marks of Physics: ");
//        byte py = sc.nextByte();
//        System.out.println("Enter marks if Chemistry: ");
//        byte chem = sc.nextByte();
//        System.out.println("Enter marks of Maths: ");
//        byte mh = sc.nextByte();
//
//        float TotalPer = (py + chem + mh) / 300.0f * 100;
//        System.out.println("Total Percentage is:" + TotalPer + "%");
//
//        if (TotalPer > 40 && py > 33 && chem > 33 && mh > 33) {
//            System.out.println("Congratulation! you passed the exams!");
//        } else {
//            System.out.println("Sorry ! you do not passed the exams, Please try again!");
//        }

        // Question 3
//        float tax = 0;
//        System.out.println("Enter your income: ");
//        float income = sc.nextFloat();
//        if (income <= 2.5) {
//            tax = tax + 0;
//        }
//        else if (income > 2.5f && income <= 5f) {
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if (income > 5f && income <= 10.0f) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if (income > 10.0f) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//
//        System.out.println("The total tax paid by the employee is: " + tax);

        // Question 4
//        System.out.println("Enter the number: ");
//        int day = sc.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("The day is MONDAY !");
//            case 2 -> System.out.println("The day is TUESDAY !");
//            case 3 -> System.out.println("The day is WEDNESDAY !");
//            case 4 -> System.out.println("The day is THURSDAY !");
//            case 5 -> System.out.println("The day is FRIDAY !");
//            case 6 -> System.out.println("The day is SATURDAY !");
//            case 7 -> System.out.println("The day is SUNDAY !");
//        }

        // Question 5
//        System.out.println("Enter the year: ");
//        int year = sc.nextInt();
//        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
//            System.out.println(year + " is a leap year!");
//        }
//        else {
//            System.out.println(year + " is not a leap year!");
//        }

        // Question 6
        System.out.println("Enter your Website");
        String web = sc.nextLine();

        if (web.endsWith(".com")) {
            System.out.println("This Website is an commercial website!");
        }
        else if (web.endsWith(".org")) {
            System.out.println("This Website is an organizational website!");
        }
        else if (web.endsWith(".in")){
            System.out.println("This Website is an indian website!");
        }
    }
}
