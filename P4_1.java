package com.Atmiya;
import java.util.Scanner;

public class P4_1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[5];
        System.out.println("Enter elements of the array");
        for (int i=0; i< num.length; i++){
            num [i] = sc.nextInt();
        }
        System.out.println("Printing elements of the array");
        for (int j=0; j< num.length; j++) {
            System.out.printf("num [%d] = %d \n",j,num[j]);
        }
    }
}
