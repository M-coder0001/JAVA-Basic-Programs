package com.company;
import java.util.Scanner;

public class Conditionals {
    static void main() {
        int age;
//        if(age > 18){
//            System.out.println("yes u can drive");
//        }
//        else {
//            System.out.println("NO you cannot drive yet");

//        elseif statements ------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        age = sc.nextInt();

        if (age > 56) {
            System.out.println("You are experienced!");
        } else if (age > 46) {
            System.out.println("You are semi-experienced");
        } else if (age > 36) {
            System.out.println("You are semi-semi-experienced");
        } else {
            System.out.println("You are not  experienced");
        }
    }
}


