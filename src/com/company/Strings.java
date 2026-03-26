package com.company;
import java.util.Scanner;

public class Strings {
    static void main() {
        String st = new String("Mayank"); //String is not a primitive data type it is a class in java but can be used as a datatype
        System.out.println(st);

        String a = "This is a string as datatype";
        System.out.println(a);

        //types of print
        System.out.println("Adds a new line after printing");
        System.out.print("Do not add a new line after printing");
        System.out.println("-------------------");
        int m = 10 ;
        float b = 20;
        System.out.printf("The value of m is %d and the value of b is %f ",m,b);
        //printf does the work in java same as c programming
        System.out.format("The value of m is %d and the value of b is %f ",m,b);
        //format is same as printf
        System.out.println("------------------------------- -----------------");

        //User input string
        Scanner sc = new Scanner(System.in);

        //String myk = sc.next() //sc.next() do not print the string after blank space
        String myk = sc.nextLine(); //print whole string
        System.out.println(myk);

    }
}
