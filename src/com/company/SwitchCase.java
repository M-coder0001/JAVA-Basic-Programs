package com.company;
import java.util.Scanner;

public class SwitchCase {
    static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("You are going to become ab Adult!");
                break;
            case 23:
                System.out.println("You are going to join a job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life!");
        }

        //-------------------Enhanced switch---------------
        String var = "Mayank";
        switch (var) {
            case "Mayank" -> System.out.println("Name is Mayank!");
            case "Raj" -> System.out.println("Name is Raj!");
            case "Rahul" -> System.out.println("Name is Rahul!");
            default -> System.out.println("Name not found!");
        }
    }
}
